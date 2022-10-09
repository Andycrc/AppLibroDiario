/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidades.AsientoTB;
import Entidades.Conector;
import Entidades.Render;
import Formularios.AsientosConatables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
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

           
            
        
        String[] columnNames = {"N° Asiento","Código", "Cuenta", "Comentario","Debe", "Haber" , "Fecha"};
        model.setColumnIdentifiers(columnNames);
        // Código a ejecutar si no hay errores
        String sql = "SELECT " +
                "nasiento, "+
                 "codigo, " +
                 "nombrec, "+
                "comentario,"+
                 "debe, "+
                 "haber, "+
                 "fecha "+
                 "from asiento ";            
//                 "where ctcodigo_cuenta = ";
            
            Connection conexion = this.ObjConexion.getConexion();
            PreparedStatement pstm = conexion.prepareStatement(sql);
            ResultSet resultados = pstm.executeQuery();
            
            
            while(resultados.next()){  

                datos.setnAsiento(resultados.getInt("nasiento"));
                datos.setCodigo(resultados.getInt("codigo"));
                datos.setNombrec(resultados.getString("nombrec"));
                datos.setDebe(resultados.getInt("debe"));
                datos.setHaber(resultados.getInt("haber"));
                datos.setFecha(resultados.getString("fecha"));
                datos.setComentario(resultados.getString("comentario"));
               model.addRow(new Object[]{datos.getnAsiento(), 
                   datos.getCodigo(),
                   datos.getNombrec(),
                   datos.getComentario(),
                   datos.getDebe(),
                   datos.getHaber(),
                   datos.getFecha(),
                         });
            }       
            return model;
             
        
    
    }
    
    
    
    
    
}
