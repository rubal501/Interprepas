/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Controlador;

import Negocio.Modelo.Examen;
import Negocio.Modelo.Inciso;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * <<<<<<< HEAD @a
 *
 *
 * uthor rubal y ale >:( NOTA IMPORTANTE El orden de los datos en la database es
 * el siguiente: identificador int(1), textoPregunta char(200), primerRespuesta
 * char(130), segundaRespuesta char(130),terceraRespuesta char(130),
 * ,cuartaRespuesta char(130), respuestaCorrecta int(1), grado char(1),
 * claveAsignatura char(4) =======
 *
 * @author rubal y ale >:( NOTA IMPORTANTE El orden de los datos en la database
 * es el siguiente: identificador int(1), textoPregunta char(200),
 * primerRespuesta char(130), segundaRespuesta char(130),terceraRespuesta
 * char(130), ,cuartaRespuesta char(130), respuestaCorrecta int(1), grado
 * char(1), claveAsignatura char(4) >>>>>>> Alejandro2
 */
public class ExamenControlador {

    static String sql;
    static ResultSet resultado;
    static Examen registroFinal = new Examen();
    static Vector registro = new Vector();
    static Inciso inciso = new Inciso();

    public static void GuardarRegistro(Inciso inciso) {
        if (registro.add(inciso)) {
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
        }
    }

    public static void GuardarRegistroBD(Inciso i) throws SQLException {

        sql = "insert into incisos (textoPregunta, primeraRespuesta, segundaRespuesta,"
                + "terceraRespuesta, cuartaRespuesta, respuestaCorrecta, grado,"
                + "claveAsignatura)  values(\"" + i.pregunta
                + "\", \"" + i.respuestas.get(0) + "\", \"" + i.respuestas.get(1)
                + "\", \"" + i.respuestas.get(2) + "\", \"" + i.respuestas.get(3)
                + "\", \"" + i.getRespuestaCorrecta() + "\", \"" + i.getGrado()
                + "\", \"" + i.getAsignatura() + "\")";

//        Alejabndro se esta encargando de hacer que los datos dejen de estar fijos
        System.out.println(sql);

        try {
            Conexion.ejecutarSQL(sql);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public static Inciso BorrarBD(Inciso inciso) throws SQLException {

        sql = "delete from incisos where nocta='" + inciso.identificador + "'";
        if (inciso.identificador.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ya no hay registros o registro en blanco");
        } else if (Conexion.ejecutarSQL(sql)) {
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente al inciso");
            inciso = CargarRegistrosBD();
        }
        return inciso;
    }

    public static String MostrarRegistros() {
        String Linea = "", Linea2;
        for (int i = 0; i < registro.size(); i++) {
            inciso = (Inciso) registro.get(i);
            Linea2 = inciso.identificador + " " + inciso.getRespuestaPrimera() + " " + inciso.getRespuestaSegunda() + " " + inciso.getRespuestaTercera() + " "
                    + inciso.getRespuestaCuarta() + " " + inciso.respuestaCorrecta + " " + inciso.asignatura + " " + inciso.grado;

            Linea = Linea + Linea2 + "\n";
        }
        return Linea;
    }

    public static Inciso CargarRegistrosBD() throws HeadlessException, SQLException {

        sql = "select * from incisos;";

        try {
            resultado = Conexion.ejecutarSQLSelect(sql);
            if (resultado.first()) //primero sin if y sin el else ;)
            {

                inciso.identificador = resultado.getString("identificador");
                inciso.respuestas.set(0, resultado.getString("primeraRespuesta"));
                inciso.respuestas.set(1, resultado.getString("segundaRespuesta"));
                inciso.respuestas.set(2, resultado.getString("terceraRespuesta"));
                inciso.respuestas.set(3, resultado.getString("cuartaRespuesta"));
                inciso.respuestaCorrecta = resultado.getInt("respuestaCorrecta");
                inciso.asignatura = resultado.getString("asignatura");
                inciso.grado = resultado.getString("grado").charAt(0);

//            TODO
//            utilizar setter y getters
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún registro :P");

                inciso.identificador = "";
                inciso.setRespuestaPrimera("");
                inciso.setRespuestaSegunda("");
                inciso.setRespuestaTercera("");
                inciso.setRespuestaCuarta("");
                inciso.respuestaCorrecta = 0;
                inciso.asignatura = "";
                inciso.grado = '\0';

            }
        } catch (HeadlessException | SQLException ex) {
            throw ex;
        }
        return inciso;
    }

    public static Inciso SiguienteBD() throws HeadlessException, SQLException {
        try {
            //resultado=Conexion.ejecutarSQLSelect(sql);
            //  while(resultado.);
            if (resultado.isLast()) {
                JOptionPane.showMessageDialog(null, "Último registro de la base");
            } else {
                resultado.next();
                inciso.identificador = resultado.getString("identificador");
                inciso.setRespuestaPrimera(resultado.getString("primeraRespuesta"));
                inciso.setRespuestaSegunda(resultado.getString("segundaRespuesta"));
                inciso.setRespuestaTercera(resultado.getString("terceraRespuesta"));
                inciso.setRespuestaCuarta(resultado.getString("cuartaRespuesta"));
                inciso.respuestaCorrecta = resultado.getInt("respuestaCorrecta");
                inciso.asignatura = resultado.getString("claveAsignatura");
                inciso.grado = resultado.getString("grado").charAt(0);
            }

        } catch (HeadlessException | SQLException ex) {
            throw ex;
        }
        return inciso;
    }

    public static Inciso AnteriorBD() throws HeadlessException, SQLException {
        try {
            //resultado=Conexion.ejecutarSQLSelect(sql);
            //  while(resultado.);
            if (resultado.isFirst()) {
                JOptionPane.showMessageDialog(null, "Primer registro de la base");
            } else {
                resultado.previous();
                inciso.identificador = resultado.getString("identificador");
                inciso.setRespuestaPrimera(resultado.getString("primeraRespuesta"));
                inciso.setRespuestaSegunda(resultado.getString("segundaRespuesta"));
                inciso.setRespuestaTercera(resultado.getString("terceraRespuesta"));
                inciso.setRespuestaCuarta(resultado.getString("cuartaRespuesta"));
                inciso.respuestaCorrecta = resultado.getInt("respuestaCorrecta");
                inciso.asignatura = resultado.getString("claveAsignatura");
                inciso.grado = resultado.getString("grado").charAt(0);
            }

        } catch (HeadlessException | SQLException ex) {
            throw ex;
        }
        return inciso;
    }

    //TODO crear un metodo creador de examenes
}
