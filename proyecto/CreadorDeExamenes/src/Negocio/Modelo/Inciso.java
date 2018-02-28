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
    public char grado; //(4-6)
    public int respuestaCorrecta; //index de la respuesta correcta (0-3)
    public String identificador;
    public String asignatura ;
    public List<String> respuestas;

    public Inciso() {
        respuestas = new ArrayList<String>(4);
    }

    public Inciso(String pregunta, /*char grado,*/ int respuestaCorrecta, /*int identificador,*/ List<String> respuestas) {
        this.pregunta = pregunta;
        //this.grado = grado;
        this.respuestaCorrecta = respuestaCorrecta;
        //this.identificador = identificador;
        this.respuestas = respuestas;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
/*
    public char getGrado() {
        return grado;
    }

    public void setGrado(char grado) {
        this.grado = grado;
    }
*/
    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestCorrecta) {
        this.respuestaCorrecta = respuestCorrecta;
    }
/*
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
*/
    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }
    
}
