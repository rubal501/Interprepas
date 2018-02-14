/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ROOT
 */
public class Examen {
    String claveAsignatura;
    String nombreAsignatura;
    String nombreMaestro;
    String nombreEscuela;
    
    List<Inciso> incisos;

    public Examen(List<Inciso> incisos) {
        this.incisos = incisos;
    }
}

/**
 * TODO
 * 
 * Agregar atributos refrentes al alumno
 */