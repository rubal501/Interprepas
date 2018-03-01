package Negocio.Controlador;

import Negocio.Modelo.Examen;
import Negocio.Modelo.Inciso;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * @author AlRu
 */
public class ExamenControlador {
    static String sql;
    static ResultSet resultado;
    static Examen registroFinal = new Examen();
    static Vector registro = new Vector();
    static Inciso inciso = new Inciso();

    /**
     * Agrega un registro en la base de datos con la informacion de un inciso
     * @param i el inciso que contiene la informacion
     * @throws SQLException si hubo un error al ejecutar el comando sql
     */
    public static void GuardarRegistroBD(Inciso i) throws SQLException {
        sql = "insert into incisos (textoPregunta, primeraRespuesta, segundaRespuesta,"
                + "terceraRespuesta, cuartaRespuesta, respuestaCorrecta, grado,"
                + "claveAsignatura) values( \""+i.pregunta
               +"\", \""+i.respuestas.get(0)+"\", \""+i.respuestas.get(1)
               +"\", \""+i.respuestas.get(2)+"\", \""+i.respuestas.get(3) 
               +"\", \""+i.getRespuestaCorrecta()+"\", \""+i.getGrado()
               +"\", \""+i.getAsignatura()+"\")";
        
        try {
            Conexion.ejecutarSQL(sql);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    /**
     * Carga los registros de la base de datos
     * @return el inciso con los datos del registro seleccionado de la base de datos 
     * @throws SQLException si hubo un error al ejecutar el comando sql
     */
    public static Inciso CargarRegistrosBD() throws SQLException {
        sql = "select * from incisos";

        try {
            resultado = Conexion.ejecutarSQLSelect(sql);
            if (resultado.first()) {
                inciso.pregunta = resultado.getString("textoPregunta");
                inciso.identificador = resultado.getString("identificador");
                inciso.respuestas.add(resultado.getString("primeraRespuesta"));
                inciso.respuestas.add(resultado.getString("segundaRespuesta"));
                inciso.respuestas.add(resultado.getString("terceraRespuesta"));
                inciso.respuestas.add(resultado.getString("cuartaRespuesta"));
                inciso.respuestaCorrecta = resultado.getInt("respuestaCorrecta");
                inciso.asignatura = resultado.getString("claveAsignatura");
                inciso.grado = resultado.getString("grado").charAt(0);
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún registro");
                inciso.identificador = "";
                inciso.respuestas.add("");
                inciso.respuestas.add("");
                inciso.respuestas.add("");
                inciso.respuestas.add("");
                inciso.respuestaCorrecta = 0;
                inciso.asignatura = "";
                inciso.grado = '\0';
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return inciso;
    }

    /**
     * Carga el siguiente registro de la base de datos
     * @return el inciso con la informacion del registro correspondiente
     * @throws SQLException si hubo un error al ejecutar el comando sql
     * @throws IndexOutOfBoundsException si se está en el último registro de la base de datos
     */
    public static Inciso SiguienteBD() throws SQLException, IndexOutOfBoundsException {
        try {
            if (resultado.isLast()) {
                throw new IndexOutOfBoundsException();
            } else {
                resultado.next();
                inciso.respuestas.clear();
                inciso.pregunta = resultado.getString("textoPregunta");
                inciso.identificador = resultado.getString("identificador");
                inciso.respuestas.add(resultado.getString("primeraRespuesta"));
                inciso.respuestas.add(resultado.getString("segundaRespuesta"));
                inciso.respuestas.add(resultado.getString("terceraRespuesta"));
                inciso.respuestas.add(resultado.getString("cuartaRespuesta"));
                inciso.respuestaCorrecta = resultado.getInt("respuestaCorrecta");
                inciso.asignatura = resultado.getString("claveAsignatura");
                inciso.grado = resultado.getString("grado").charAt(0);
            }

        } catch (SQLException | IndexOutOfBoundsException ex) {
            throw ex;
        }
        return inciso;
    }

    /**
     * Carga el registro anterior de la base de datos
     * @return el inciso con la informacion del registro correspondiente
     * @throws SQLException si hubo un error al ejecutar el comando sql
     */
    public static Inciso AnteriorBD() throws SQLException {
        try {
            //resultado=Conexion.ejecutarSQLSelect(sql);
            //  while(resultado.);
            if (resultado.isFirst()) {
                JOptionPane.showMessageDialog(null, "Primer registro de la base");
            } else {
                resultado.previous();
                inciso.respuestas.clear();
                inciso.pregunta = resultado.getString("textoPregunta");
                inciso.identificador = resultado.getString("identificador");
                inciso.respuestas.add(resultado.getString("primeraRespuesta"));
                inciso.respuestas.add(resultado.getString("segundaRespuesta"));
                inciso.respuestas.add(resultado.getString("terceraRespuesta"));
                inciso.respuestas.add(resultado.getString("cuartaRespuesta"));
                inciso.respuestaCorrecta = resultado.getInt("respuestaCorrecta");
                inciso.asignatura = resultado.getString("claveAsignatura");
                inciso.grado = resultado.getString("grado").charAt(0);
            }

        } catch (SQLException ex) {
            throw ex;
        }
        return inciso;
    }
}

/*
 * Notas:
 * El orden de los datos en la database: identificador int(1), textoPregunta
 * char(200), primerRespuesta char(130), segundaRespuesta char(130),
 * terceraRespuesta char(130), cuartaRespuesta char(130), respuestaCorrecta 
 * int(1), grado char(1), claveAsignatura char(4)
 */