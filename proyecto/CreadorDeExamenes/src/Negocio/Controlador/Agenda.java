/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Negocio.Controlador;
//
//import Negocio.Modelo.Inciso;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Vector;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author rubal501
// * TODO: Quitar las referencias a Al rp
// */
//public class Agenda {
//       static String sql;
//       static ResultSet resultado;
//    static Vector registro=new Vector();
//    static Inciso inciso=new Inciso();
//    public static void GuardarRegistro(Inciso inciso){
//        if(registro.add(inciso)){
//            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
//        }
//    }
//    public static void GuardarRegistroBD(Inciso inciso){
//       
//        sql="insert into incisos values('"+inciso.Nombre+"','"+inciso.ApellidoP+"','"+inciso.ApellidoM+"','"+inciso.Nocta+"')";
//       if(Conexion.ejecutarSQL(sql)){
//            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
//        }
//    }
//    public static Inciso BorrarBD(Inciso inciso){
//       
//        sql="delete from incisos where nocta='"+inciso.Nocta+"'";
//        if(inciso.Nombre.isEmpty())
//        {
//            JOptionPane.showMessageDialog(null, "Ya no hay registros o registro en blanco");
//        }
//        else
//        {
//          if(Conexion.ejecutarSQL(sql)){
//            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente al inciso:\n"+inciso.Nombre+" "+inciso.ApellidoP+" "+inciso.ApellidoM);
//            inciso=CargarRegistrosBD();    
//            }  
//        }
//        return inciso;
//    }
//    public static String MostrarRegistros(){
//        String Linea="",Linea2;
//        for(int i=0;i<registro.size();i++)
//        {
//            inciso=(Inciso) registro.get(i);
//            Linea2=inciso.Nombre+" "+inciso.ApellidoP+" "+inciso.ApellidoM+" "+inciso.Nocta;
//            Linea=Linea+Linea2+"\n";
//        }
//        return Linea;
//    }
//    public static Inciso CargarRegistrosBD(){
//
//        sql="select * from incisos";
//        
//        try{
//            resultado=Conexion.ejecutarSQLSelect(sql);
//            if(resultado.first()) //primero sin if y sin el else ;)
//            {
//            inciso.Nombre=resultado.getString("nombre");
//            inciso.ApellidoP=resultado.getString("appat");
//            inciso.ApellidoM=resultado.getString("apmat");
//            inciso.Nocta=resultado.getString("nocta");
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "No hay ningún registro :P");
//                inciso.Nombre="";
//            inciso.ApellidoP="";
//            inciso.ApellidoM="";
//            inciso.Nocta="";
//            }
//        }
//            catch (Exception e)
//        {
//            
//             e.printStackTrace();
//        }
//        return inciso;
//    }
//    public static Inciso SiguienteBD(){
//        try{
//        //resultado=Conexion.ejecutarSQLSelect(sql);
//      //  while(resultado.);
//            if (resultado.isLast())
//            {
//                JOptionPane.showMessageDialog(null, "Último registro de la base");
//            }
//            else
//            {
//            resultado.next();
//        inciso.Nombre=resultado.getString("nombre");
//        inciso.ApellidoP=resultado.getString("appat");
//        inciso.ApellidoM=resultado.getString("apmat");
//        inciso.Nocta=resultado.getString("nocta");
//            }
//        
//        }
//            catch (Exception e)
//        {
//             e.printStackTrace();
//        }
//        return inciso;
//    }
//  public static Inciso AnteriorBD(){
//        try{
//        //resultado=Conexion.ejecutarSQLSelect(sql);
//      //  while(resultado.);
//            if (resultado.isFirst())
//            {
//                JOptionPane.showMessageDialog(null, "Primer registro de la base");
//            }
//            else
//            {
//            resultado.previous();
//        inciso.Nombre=resultado.getString("nombre");
//        inciso.ApellidoP=resultado.getString("appat");
//        inciso.ApellidoM=resultado.getString("apmat");
//        inciso.Nocta=resultado.getString("nocta");
//            }
//        
//        }
//            catch (Exception e)
//        {
//             e.printStackTrace();
//        }
//        return inciso;
//    }
//}
