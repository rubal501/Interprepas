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
 * @author ale
 */
public class Inciso {

    public String pregunta;
    public char grado; //(4-6)
    public int respuestaCorrecta; //index de la respuesta correcta (0-3)
    public String identificador;
    public String asignatura;
    public String respuestaPrimera;
    public String respuestaSegunda;
    public String respuestaTercera;
    public String respuestaCuarta;
    public List<String> respuestas;

    public Inciso() {

    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }

    public Inciso(String pregunta, char grado, int respuestaCorrecta, /*int identificador,*/
            String respuestaPrimera, String respuestaSegunda, String respuestaTercera, String respuestaCuarta) {
        this.respuestaPrimera = respuestaPrimera;
        this.respuestaSegunda = respuestaSegunda;
        this.respuestaTercera = respuestaTercera;
        this.respuestaCuarta = respuestaCuarta;
    }

    public Inciso(String pregunta, char grado, int respuestaCorrecta, List<String> respuestas, String asignatura) {
        
        this.asignatura = asignatura ;
        this.pregunta = pregunta;
        this.grado = grado;
        this.respuestaCorrecta = respuestaCorrecta;
        //this.identificador = identificador;
        this.respuestas = respuestas;

    }

/**
     *
     * Constructor utilizado para los casos donde las preguntas se manejen como
     * variables independientes
     *
     * @param sql Cadena que contiene la instrucción SQL a ejecutar
     * @return resultado regresa los registros generados por la consulta
     * @throws SQLException si no se pudo ejecutar el comando
     *
     */
    public Inciso(String pregunta, char grado, int respuestaCorrecta, String asignatura, String respuestaPrimera, String respuestaSegunda, String respuestaTercera, String respuestaCuarta) {
        this.pregunta = pregunta;
        this.grado = grado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.asignatura = asignatura;
        this.respuestaPrimera = respuestaPrimera;
        this.respuestaSegunda = respuestaSegunda;
        this.respuestaTercera = respuestaTercera;
        this.respuestaCuarta = respuestaCuarta;
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
    public String getRespuestaPrimera() {
        return respuestaPrimera;
    }

    public String getRespuestaSegunda() {
        return respuestaSegunda;
    }

    public String getRespuestaTercera() {
        return respuestaTercera;
    }

    public String getRespuestaCuarta() {
        return respuestaCuarta;
    }

    public void setRespuestaPrimera(String respuestaPrimera) {
        this.respuestaPrimera = respuestaPrimera;
    }

    public void setRespuestaSegunda(String respuestaSegunda) {
        this.respuestaSegunda = respuestaSegunda;
    }

    public void setRespuestaTercera(String respuestaTercera) {
        this.respuestaTercera = respuestaTercera;
    }

    public void setRespuestaCuarta(String respuestaCuarta) {
        this.respuestaCuarta = respuestaCuarta;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;

    }

}
