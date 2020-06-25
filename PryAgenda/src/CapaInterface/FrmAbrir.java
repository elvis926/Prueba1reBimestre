/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterface;

import CapaDatos.ClsArchivos;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class FrmAbrir extends javax.swing.JInternalFrame {

    DefaultTableModel contactos = new DefaultTableModel();
    ClsArchivos file = new ClsArchivos();

    /**
     * Creates new form WinAbrir
     */
    public FrmAbrir() {
        initComponents();
        ingresarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAbrir = new javax.swing.JButton();
        BtnRetornar = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();

        setTitle("Apertura de agenda");
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAbrir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1057, 28, -1, -1));

        BtnRetornar.setText("RETORNAR");
        BtnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetornarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        BtnRetornar.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ingresarCabeceraTabla() {
        String[] cabecera = new String[]{"Nombre", "Apellido", "Telefono", "Correo"};
        contactos.setColumnIdentifiers(cabecera);
        //TblContactos.setModel(contactos);
        //TblContactos.setEnabled(false);
    }

    public void limpiarTabla() {
      /* try {
            //DefaultTableModel modelo = (DefaultTableModel) TblContactos.getModel();
           // int filas = TblContactos.getRowCount();
            for (int i = 0; i <= filas; i++) {
          //      modelo.removeRow(0);
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }*/
    }

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        String nombreArchivo;
        limpiarTabla();
        //nombreArchivo = TxtUbicacion.getText();
       // file.tablelistContactos(contactos, nombreArchivo);
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetornarActionPerformed
        this.hide();
    }//GEN-LAST:event_BtnRetornarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAbrir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnRetornar;
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}