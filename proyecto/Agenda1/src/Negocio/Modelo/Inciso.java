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

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public char getGrado() {
        return grado;
    }

    public void setGrado(char grado) {
        this.grado = grado;
    }

    public int getRespuestCorrecta() {
        return respuestCorrecta;
    }

    public void setRespuestCorrecta(int respuestCorrecta) {
        this.respuestCorrecta = respuestCorrecta;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }
    
}
