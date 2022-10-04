package Entidades;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
    Autor: Xamus Dyson
    Descripción: Controlador para la tabla datos
    Sitio: https://www.cablenaranja.com
 */

public class ControlDatos {
    private Conector conectar;
    private ModeloDatos modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conector();
        modelo = new ModeloDatos();
    }
    
//    public void insertar(String nombre, int edad, String sexo){
//        PreparedStatement ps;
//        String sql;
//        modelo.setNombre(nombre);
//        modelo.setEdad(edad);
//        modelo.setSexo(sexo);
//        try{
//            con = conectar.getConexion();
//            sql = "insert into datos(nombre, edad, sexo) values(?,?,?)";
//            ps = con.prepareStatement(sql);
//            ps.setString(1, modelo.getNombre());
//            ps.setInt(2, modelo.getEdad());
//            ps.setString(3, modelo.getSexo());
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "¡Se han insertado con éxito los datos!");
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
//        }
//    }
    
    public ArrayList<ModeloDatos> llenarDatos(){
        ModeloDatos datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloDatos> lista = new ArrayList<>();
        String sql = "select id, nombre, edad, sexo from datos";
        try{
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloDatos();
                datos.setId(rs.getInt("id"));
                datos.setNombre(rs.getString("nombre"));                
                lista.add(datos);             
            }            
            rs.close();
            ps.close();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return lista;
    }
}
