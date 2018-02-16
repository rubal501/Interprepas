/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Controlador;

import Negocio.Modelo.Examen;
import Negocio.Modelo.Inciso;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author rubal
 * NOTA IMPORTANTE
 * El orden de los datos en la database es el siguiente:
 * identificador int(1), textoPregunta char(200), primerRespuesta char(130), 
 * segundaRespuesta char(130),terceraRespuesta char(130),
 * ,cuartaRespuesta char(130), respuestaCorrecta int(1), grado char(1),
 * claveAsignatura char(4)
 */
public class ExamenControlador {
        static String sql;
        static ResultSet resultado;
        static Examen registroFinal =new Examen();
        static Vector registro=new Vector();
        static Inciso inciso=new Inciso();
        public static void GuardarRegistro(Inciso inciso){
        if(registro.add(inciso)){
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
        }
    }
    public static void GuardarRegistroBD(Inciso inciso){
       
        sql="insert into incisos values('"+inciso.identificador+"','"+inciso.pregunta+
                "','"+inciso.respuestas.get(0)+"','"+inciso.respuestas.get(1)+""
                + ",'"+inciso.respuestas.get(2)+""+ ",'"+inciso.respuestas.get(3)+""
                + " ,'"+inciso.pregunta+"',,'"+inciso.pregunta+"',)";
       if(Conexion.ejecutarSQL(sql)){
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
        }
    }
    public static Inciso BorrarBD(Inciso inciso){
       
        sql="delete from incisos where nocta='"+inciso.identificador+"'";
        if(inciso.identificador.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ya no hay registros o registro en blanco");
        }
        else
        {
          if(Conexion.ejecutarSQL(sql)){
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente al inciso");
            inciso=CargarRegistrosBD();    
            }  
        }
        return inciso;
    }
    public static String MostrarRegistros(){
        String Linea="",Linea2;
        for(int i=0;i<registro.size();i++)
        {
            inciso=(Inciso) registro.get(i);
            Linea2=inciso.identificador+" "+inciso.respuestas.get(0)+" "+inciso.respuestas.get(1)+" "+inciso.respuestas.get(2)+" "
          +inciso.respuestas.get(3)+" "+inciso.respuestaCorrecta + " "+  inciso.asignatura +" "+ inciso.grado;
            
            
            
            
            
            
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
            inciso.identificador=resultado.getString("identificador");
            inciso.respuestas.set(0, resultado.getString("primeraRespuesta"));
            inciso.respuestas.set(1, resultado.getString("segundaRespuesta"));
            inciso.respuestas.set(2, resultado.getString("terceraRespuesta"));
            inciso.respuestas.set(3, resultado.getString("cuartaRespuesta"));
            inciso.respuestaCorrecta =resultado.getInt("apmat");
            inciso.asignatura=resultado.getString("nocta");
            inciso.grado = resultado.getString("nocta").charAt(0);
//            TODO
//            utilizar setter y getters
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No hay ningún registro :P");
                inciso.identificador= "" ;
            inciso.respuestas.set(0, "");
            inciso.respuestas.set(1, "");
            inciso.respuestas.set(2, "");
            inciso.respuestas.set(3, "");
            inciso.respuestaCorrecta = 0 ;
            inciso.asignatura= "";
            inciso.grado = '\0';
            }
        }
            catch (Exception e)
        {
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
            inciso.identificador=resultado.getString("identificador");
            inciso.respuestas.set(0, resultado.getString("primeraRespuesta"));
            inciso.respuestas.set(1, resultado.getString("segundaRespuesta"));
            inciso.respuestas.set(2, resultado.getString("terceraRespuesta"));
            inciso.respuestas.set(3, resultado.getString("cuartaRespuesta"));
            inciso.respuestaCorrecta =resultado.getInt("apmat");
            inciso.asignatura=resultado.getString("nocta");
            inciso.grado = resultado.getString("dasd").charAt(0);
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
            inciso.identificador=resultado.getString("identificador");
            inciso.respuestas.set(0, resultado.getString("primeraRespuesta"));
            inciso.respuestas.set(1, resultado.getString("segundaRespuesta"));
            inciso.respuestas.set(2, resultado.getString("terceraRespuesta"));
            inciso.respuestas.set(3, resultado.getString("cuartaRespuesta"));
            inciso.respuestaCorrecta =resultado.getInt("apmat");
            inciso.asignatura=resultado.getString("nocta");
            inciso.grado = resultado.getString("sdweeq").charAt(0);
            }
        
        }
            catch (Exception e)
        {
             e.printStackTrace();
        }
        return inciso;
    }
  
  //TODO crear un metodo creador de examenes
}
