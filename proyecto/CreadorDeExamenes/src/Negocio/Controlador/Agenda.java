/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Controlador;

import Negocio.Modelo.Alumno;
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
    static Alumno alumno=new Alumno();
    public static void GuardarRegistro(Alumno alumno){
        if(registro.add(alumno)){
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al alumno");
        }
    }
    public static void GuardarRegistroBD(Alumno alumno){
       
        sql="insert into alumnos values('"+alumno.Nombre+"','"+alumno.ApellidoP+"','"+alumno.ApellidoM+"','"+alumno.Nocta+"')";
       if(Conexion.ejecutarSQL(sql)){
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al alumno");
        }
    }
    public static Alumno BorrarBD(Alumno alumno){
       
        sql="delete from alumnos where nocta='"+alumno.Nocta+"'";
        if(alumno.Nombre.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ya no hay registros o registro en blanco");
        }
        else
        {
          if(Conexion.ejecutarSQL(sql)){
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente al alumno:\n"+alumno.Nombre+" "+alumno.ApellidoP+" "+alumno.ApellidoM);
            alumno=CargarRegistrosBD();    
            }  
        }
        return alumno;
    }
    public static String MostrarRegistros(){
        String Linea="",Linea2;
        for(int i=0;i<registro.size();i++)
        {
            alumno=(Alumno) registro.get(i);
            Linea2=alumno.Nombre+" "+alumno.ApellidoP+" "+alumno.ApellidoM+" "+alumno.Nocta;
            Linea=Linea+Linea2+"\n";
        }
        return Linea;
    }
    public static Alumno CargarRegistrosBD(){

        sql="select * from alumnos";
        
        try{
            resultado=Conexion.ejecutarSQLSelect(sql);
            if(resultado.first()) //primero sin if y sin el else ;)
            {
            alumno.Nombre=resultado.getString("nombre");
            alumno.ApellidoP=resultado.getString("appat");
            alumno.ApellidoM=resultado.getString("apmat");
            alumno.Nocta=resultado.getString("nocta");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No hay ningún registro :P");
                alumno.Nombre="";
            alumno.ApellidoP="";
            alumno.ApellidoM="";
            alumno.Nocta="";
            }
        }
            catch (Exception e)
        {
            
             e.printStackTrace();
        }
        return alumno;
    }
    public static Alumno SiguienteBD(){
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
        alumno.Nombre=resultado.getString("nombre");
        alumno.ApellidoP=resultado.getString("appat");
        alumno.ApellidoM=resultado.getString("apmat");
        alumno.Nocta=resultado.getString("nocta");
            }
        
        }
            catch (Exception e)
        {
             e.printStackTrace();
        }
        return alumno;
    }
  public static Alumno AnteriorBD(){
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
        alumno.Nombre=resultado.getString("nombre");
        alumno.ApellidoP=resultado.getString("appat");
        alumno.ApellidoM=resultado.getString("apmat");
        alumno.Nocta=resultado.getString("nocta");
            }
        
        }
            catch (Exception e)
        {
             e.printStackTrace();
        }
        return alumno;
    }
}
