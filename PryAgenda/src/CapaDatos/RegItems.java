/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

public class RegItems {
    private String _nombre;
    private String _apellido;
    private String _telefono;
    private String _correo;

    public RegItems(String _nombre, String _apellido, String _telefono, String _correo) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._telefono = _telefono;
        this._correo = _correo;
    }

    public RegItems() {
        this._nombre = "";
        this._apellido = "";
        this._telefono = "";
        this._correo = "";
    }  
    
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }

    public String getCorreo() {
        return _correo;
    }

    public void setCorreo(String _correo) {
        this._correo = _correo;
    }

    public void campos(String datos){
        String [] campo=datos.split(";");
        _nombre=campo[0];
        _apellido=campo[1];
        _telefono=campo[2];
        _correo=campo[3];  
    }
    public String registro(RegItems d){
        String registro;
        registro= _nombre+";";
        registro+= _apellido+";";
        registro+= _telefono+";";
        registro+= _correo + '\n';  
        return registro;
    }   
}
