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
public class ArrayModulo1 {
    
    
    
    List<estudiantes> ListaEstudiantes = new ArrayList();
    List<profesores> ListaProfesores = new ArrayList();
    List<cocineros> ListaCocineros = new ArrayList();
    
    
    public void agregarEstudiantes(estudiantes estudiante){
        ListaEstudiantes.add(estudiante);
    }
    public void agregarProfesor(profesores profesor){
        ListaProfesores.add(profesor);
    }
    public void agregarCocinero(cocineros cocinero){
        ListaCocineros.add(cocinero);
    }
}
