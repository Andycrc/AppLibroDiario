/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.AsientoTB;
import Entidades.Conector;
import Formularios.AsientosConatables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andy
 */
public class AsientoModel {
   
    private Conector ObjConexion;
    
    public AsientoModel() {
        ObjConexion = new Conector();
    }
    
    public DefaultTableModel obtenerDatos() throws SQLException{
        AsientoTB datos = new AsientoTB();
        DefaultTableModel model = new DefaultTableModel();
           
            
        
        String[] columnNames = {"codigo", "nombrec", "debe", "haber" , "fecha"};
        model.setColumnIdentifiers(columnNames);
        // Código a ejecutar si no hay errores
        String sql = "SELECT " +
                 "codigo, " +
                 "nombrec, "+
                 "debe, "+
                 "haber, "+
                 "fecha "+
                 "from asiento ";            
//                 "where ctcodigo_cuenta = ";
            
            Connection conexion = this.ObjConexion.getConexion();
            PreparedStatement pstm = conexion.prepareStatement(sql);
            ResultSet resultados = pstm.executeQuery();
            
            
            while(resultados.next()){               
                datos.setCodigo(resultados.getInt("codigo"));
                datos.setNombrec(resultados.getString("nombrec"));
                datos.setDebe(resultados.getInt("debe"));
                datos.setHaber(resultados.getInt("haber"));
                datos.setFecha(resultados.getString("fecha"));
               model.addRow(new Object[]{datos.getCodigo(), datos.getNombrec(), datos.getDebe(), datos.getHaber(), datos.getFecha()});
            }       
            return model;
             
        
    
    }
    
    
    
    
    
}
