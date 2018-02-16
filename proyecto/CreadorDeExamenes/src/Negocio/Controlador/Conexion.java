/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author d204
 */
public class Conexion {
  static  Connection  conexionOK;
  static String sql;
public Connection getConexion()
{
   return conexionOK;
}
 
/**
* Método utilizado para establecer la conexión con la base de datos
* @return estado regresa el estado de la conexión, true si se estableció la conexión,
* falso en caso contrario
*/
public static boolean crearConexion()
{
   try {
      Class.forName("com.mysql.jdbc.Driver");
      conexionOK = DriverManager.getConnection("jdbc:mysql://localhost:3306/Preguntas","root","");
   } catch (SQLException ex) {
      ex.printStackTrace();
      return false;
   } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
      return false;
   }
 
   return true;
}
 
/**
*
*Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
*@param sql Cadena que contiene la instrucción SQL a ejecutar
*@return estado regresa el estado de la ejecución, true(éxito) o false(error)
*
*/
public static boolean ejecutarSQL(String sql) 
{
   try {
      Statement sentencia = conexionOK.createStatement();
      sentencia.executeUpdate(sql);
   } catch (SQLException ex) {
      ex.printStackTrace();
   return false;
   }
 
   return true;
}
 
/**
*
*Método utilizado para realizar la instrucción SELECT
*@param sql Cadena que contiene la instrucción SQL a ejecutar
*@return resultado regresa los registros generados por la consulta
*
*/
public static ResultSet ejecutarSQLSelect(String sql)
{
   ResultSet resultado;
   try {
      Statement sentencia = conexionOK.createStatement();
      resultado = sentencia.executeQuery(sql);
   } catch (SQLException ex) {
      ex.printStackTrace();
      return null;
   }
 
   return resultado;
}
}
