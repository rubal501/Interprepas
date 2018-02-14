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
    String pregunta;
    char grado; //(4-6)
    int respuestCorrecta; //index de la respuesta correcta (0-3)
    int identificador;
    List<String> respuestas;

    public Inciso() {
        respuestas = new ArrayList<String>();
    }
}
