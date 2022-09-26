/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;/**
/**
 *
 * @author Eterna
 */
public class Conector {
    String url = "src\\base\\conta.db";
    Connection connect = null;
    public String msj;


    public Connection conectar(){
        try {
         connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if (connect!=null) {
              msj="Conectado";
             System.out.println("Si");
        }
        }catch (SQLException ex) {
                 msj="No se ha podido conectar a la base de datos\n";
        }
        return connect;
    }


    public void close(){
        try {
            connect.close();
        } catch (SQLException ex) {
        }
    }

   
}
