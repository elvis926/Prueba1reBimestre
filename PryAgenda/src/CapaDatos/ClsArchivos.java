/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClsArchivos {

    public void crearArchivo(String nombreArchivo) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter(nombreArchivo);          
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException err) {
                    JOptionPane.showMessageDialog(null, err.getMessage());
                }
            }
        }
    }

    public static ArrayList leerArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        ArrayList listaContactos = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\s*;\\s*");
                RegItems nuevo = new RegItems();
                nuevo.setNombre(delimitar.next());
                nuevo.setApellido(delimitar.next());
                nuevo.setTelefono(delimitar.next());
                nuevo.setCorreo(delimitar.next());
                listaContactos.add(nuevo);
            }
            //se cierra el ojeto scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaContactos;
    }

    public void tablelistContactos(DefaultTableModel model, String nombreArchivo) {
        int con = 0;
        try {
            File f = new File(nombreArchivo);
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] contacto = linea.split(";");
                    RegItems p = new RegItems(contacto[0], contacto[1], contacto[2], contacto[3]);
                    model.insertRow(con, new Object[]{});
                    model.setValueAt(contacto[0], con, 0);
                    model.setValueAt(contacto[1], con, 1);
                    model.setValueAt(contacto[2], con, 2);
                    model.setValueAt(contacto[3], con, 3);
                }
            } else {
                System.out.println("EMPTY DATA...");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("READING ERROR" + e);
        }
    }

    public void agregarContacto(RegItems nueva, String nombreArchivo) {
        try {
            File f = new File(nombreArchivo);
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists() && f.length() != 0) {
                fw = new FileWriter(f, true);//agrega datos
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(nueva.getNombre() + ";" + nueva.getApellido() + ";" + nueva.getTelefono() + ";" + nueva.getCorreo());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(nueva.getNombre() + ";" + nueva.getApellido() + ";" + nueva.getTelefono() + ";" + nueva.getCorreo());
            }            
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al Crear Contacto");
        }
    }

    public void eliminarArchivo(String nombreArchivo) {
        File f = new File(nombreArchivo);
        f.delete();
    }

}
