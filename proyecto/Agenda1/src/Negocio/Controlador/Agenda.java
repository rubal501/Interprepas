/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Controlador;

import Negocio.Modelo.Examen;
import Negocio.Modelo.Inciso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author d204
 */
public class Agenda {
       static String sql;
       static ResultSet resultado;
    static Vector registro=new Vector();
    static Inciso inciso=new Inciso();
    public static void GuardarRegistro(Inciso inciso){
        if(registro.add(inciso)){
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
        }
    }
    public static void GuardarRegistroBD(Inciso inciso){
       
        sql="insert into incisos values('"+inciso.pregunta+"','"+inciso.respuestaCorrecta+"',"+inciso.primerRespuesta+"','"+inciso.segundaRespuesta+"','"+inciso.terceraRespuesta+"','"+inciso.cuartaRespuesta+"','"+inciso.claveAsignatura+"','"+inciso.grado+"','"+inciso.identificador+"')";
       if(Conexion.ejecutarSQL(sql)){
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
        }
    }
    
    /*
    public static Inciso BorrarBD(Inciso inciso){
       
        sql="delete from incisos where nocta='"+inciso.Nocta+"'";
        if(inciso.Nombre.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ya no hay registros o registro en blanco");
        }
        else
        {
          if(Conexion.ejecutarSQL(sql)){
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente al inciso:\n"+inciso.Nombre+" "+inciso.ApellidoP+" "+inciso.ApellidoM);
            inciso=CargarRegistrosBD();    
            }  
        }
        return inciso;
    }
*/
    
    public static String MostrarRegistros(){
        String Linea="",Linea2;
        for(int i=0;i<registro.size();i++)
        {
            inciso=(Inciso) registro.get(i);
            Linea2=inciso.pregunta+" "+inciso.respuestaCorrecta+" "+inciso.primerRespuesta+" "+inciso.segundaRespuesta+" "+inciso.terceraRespuesta+" "+inciso.cuartaRespuesta+" "+inciso.claveAsignatura+" "+inciso.grado+" "+inciso.identificador;
            Linea=Linea+Linea2+"\n";
        }
        return Linea;
    }
    public static Inciso CargarRegistrosBD(){

        sql="select * from incisos";
        
        try{
            resultado=Conexion.ejecutarSQLSelect(sql);
            if(resultado.first()) //primero sin if y sin el else ;)
            {
            inciso.pregunta=resultado.getString("pregunta");
            inciso.respuestaCorrecta=resultado.getInt("respuestaCorrecta");
            inciso.primerRespuesta=resultado.getString("primerRespuesta");
            inciso.segundaRespuesta=resultado.getString("segundaRespuesta");
            inciso.terceraRespuesta=resultado.getString("terceraRespuesta");
            inciso.cuartaRespuesta=resultado.getString("cuartaRespuesta");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No hay ningún registro :P");
                inciso.pregunta = "";
                inciso.respuestaCorrecta = 0;
                inciso.primerRespuesta = "";
                inciso.segundaRespuesta = "";
                inciso.terceraRespuesta = "";
                inciso.cuartaRespuesta = "";
            }
        }
            catch (Exception e)
        {
             e.printStackTrace();
        }
        return inciso;
    }
    public static Inciso SiguienteBD(){
        try{
        //resultado=Conexion.ejecutarSQLSelect(sql);
      //  while(resultado.);
            if (resultado.isLast())
            {
                JOptionPane.showMessageDialog(null, "Último registro de la base");
            }
            else
            {
            resultado.next();

            inciso.pregunta=resultado.getString("pregunta");
            inciso.respuestaCorrecta=resultado.getInt("respuestaCorrecta");
            inciso.primerRespuesta=resultado.getString("primerRespuesta");
            inciso.segundaRespuesta=resultado.getString("segundaRespuesta");
            inciso.terceraRespuesta=resultado.getString("terceraRespuesta");
            inciso.cuartaRespuesta=resultado.getString("cuartaRespuesta");
            }
        
        }
            catch (Exception e)
        {
             e.printStackTrace();
        }
        return inciso;
    }
  public static Inciso AnteriorBD(){
        try{
        //resultado=Conexion.ejecutarSQLSelect(sql);
      //  while(resultado.);
            if (resultado.isFirst())
            {
                JOptionPane.showMessageDialog(null, "Primer registro de la base");
            }
            else
            {
            resultado.previous();

            inciso.pregunta=resultado.getString("pregunta");
            inciso.respuestaCorrecta=resultado.getInt("respuestaCorrecta");
            inciso.primerRespuesta=resultado.getString("primerRespuesta");
            inciso.segundaRespuesta=resultado.getString("segundaRespuesta");
            inciso.terceraRespuesta=resultado.getString("terceraRespuesta");
            inciso.cuartaRespuesta=resultado.getString("cuartaRespuesta");
            }
        
        }
            catch (Exception e)
        {
             e.printStackTrace();
        }
        return inciso;
    }
}

/*
TODO

metodo borrar de la base de datos
*/