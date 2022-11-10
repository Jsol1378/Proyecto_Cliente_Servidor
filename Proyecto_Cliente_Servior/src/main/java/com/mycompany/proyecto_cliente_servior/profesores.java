/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_cliente_servior;

/**
 *
 * @author Usuario
 */
public class profesores extends Persona {
    private double salario;
    private String correo;
    public profesores() {
    }
    public profesores (String nombre, String apellidos, String Cedula, int edad, boolean activo, String correo, double salario ){
        
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setCedula(Cedula);
        this.setEdad(edad);
        this.setActivo(activo);
        this.setCorreo(correo);
        this.setSalario(salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isActivo() {
        return activo;
    }
    
}
