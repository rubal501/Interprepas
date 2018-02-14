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
public class Inciso {
    public String pregunta;
    public String primerRespuesta;
    public String segundaRespuesta;
    public String terceraRespuesta;
    public String cuartaRespuesta;
    
    public String claveAsignatura;
    public char grado; //(4-6)
    public int respuestaCorrecta; //index de la respuesta correcta (0-3)
    public int respuestaSeleccionada; //(0-3)
    public int identificador;

    public Inciso() {
    }
}
