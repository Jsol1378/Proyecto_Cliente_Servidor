/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_cliente_servior;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class estudiantes extends Persona {
    Modulo1Registro Modulo=new Modulo1Registro();
    private boolean beca;
    private int grupo;
    public estudiantes (){
        
    }
    public estudiantes (String nombre, String apellidos, String Cedula, int edad, boolean activo, boolean beca, int grupo ){
        
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setCedula(Cedula);
        this.setEdad(edad);
        this.setActivo(activo);
        this.setBeca(beca);
        this.setGrupo(grupo);
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
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

    public boolean isBeca() {
        return beca;
    }

    public int getGrupo() {
        return grupo;
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
    
    private estudiantes agregar(){
        
        estudiantes newEstudiante= new estudiantes(nombre, apellidos, cedula, edad, activo, beca, grupo);
        return newEstudiante;
    }
}
