package Negocio.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AlRu
 */
public class Inciso {

    public String pregunta;
    public char grado; //(4-6)
    public int respuestaCorrecta; //index de la respuesta correcta (0-3)
    public String identificador;
    public String asignatura ;
    public List<String> respuestas;

    public Inciso() {
        respuestas = new ArrayList<String>();
    }

    /**
     * Constructor con todos los valores
     * @param pregunta la pregunta del inciso
     * @param grado el grado escolar de la asinatura del inciso
     * @param respuestaCorrecta el index de la respuesta correcta
     * @param respuestas las respuestas del inciso
     * @param asignatura la asignatura del inciso
     */
    public Inciso(String pregunta, char grado, int respuestaCorrecta, List<String> respuestas, String asignatura) {
        this.pregunta = pregunta;
        this.grado = grado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestas = respuestas;
        this.asignatura = asignatura;
    }

    public String getPregunta() {
        return pregunta;
    }    
    public char getGrado() {
        return grado;
    }
    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
    public List<String> getRespuestas() {
        return respuestas;
    }
    public String getAsignatura() {
        return asignatura;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public void setGrado(char grado) {
        this.grado = grado;
    }
    public void setRespuestaCorrecta(int respuestCorrecta) {
        this.respuestaCorrecta = respuestCorrecta;
    }
    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
