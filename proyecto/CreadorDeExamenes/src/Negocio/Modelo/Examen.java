/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AlRu
 */
public class Examen {
    String claveAsignatura;
    String nombreAsignatura;
    String nombreMaestro;
    String nombreEscuela;
    
    List<Inciso> incisos;

    public Examen() {
        incisos = new ArrayList<Inciso>();
    }

    public String getClaveAsignatura() {
        return claveAsignatura;
    }

    public void setClaveAsignatura(String claveAsignatura) {
        this.claveAsignatura = claveAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public List<Inciso> getIncisos() {
        return incisos;
    }

    public void setIncisos(List<Inciso> incisos) {
        this.incisos = incisos;
    }
    
}

/**
 * TODO
 * 
 * Agregar atributos refrentes al alumno
 */