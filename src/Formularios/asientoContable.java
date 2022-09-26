/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Conector;
import Entidades.Dcatalogo;
import Entidades.Render;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static com.sun.jmx.remote.internal.IIOPHelper.connect;
import java.awt.Point;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Eterna
 */
public class asientoContable extends javax.swing.JPanel {
      DefaultTableModel jtModelo;
      DefaultTableModel jtModelo1;
      Dcatalogo archivo = new Dcatalogo();
      ArrayList<String> datos;
      TableRowSorter trs ;
      String vcodigo,vnombre,vdebe,vhaber,vfecha,vnumeroAsiento;
      String qry="";
      


    /**
     * Creates new form asientoContable
     */
    public asientoContable() {
        initComponents();
        jtModelo = (DefaultTableModel) this.tcodigos.getModel();   
        jtModelo1 = (DefaultTableModel) this.tasiento.getModel();   
        this.cargarParametros();
        this.cargarT2();

    }
    //cargar tabla de catalogo de cuenta
    public void cargarT2(){

        String[] datosN = new String[2]; 
        datos = archivo.leerDato();
        for (int i = 0; i < datos.size()-1; i++) {
            datosN = datos.get(i).split(",");
            jtModelo.addRow(datosN);

        }  
    } 
    //pasar valores de catalogo de cuenta a jtext para el insert
    public void cargarParametros(){
        tcodigos.addMouseListener(new MouseAdapter (){
            public void mousePressed (MouseEvent Mouse_evt){
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint ();
                int row = table.rowAtPoint(point);
                 if(Mouse_evt.getClickCount()==1){
                     pcodigo.setText (tcodigos.getValueAt(tcodigos.getSelectedRow(),0).toString());
                     pnombre.setText (tcodigos.getValueAt(tcodigos.getSelectedRow(),1).toString());
                 
                 
                 }
            }
        });
     };
    //metodo limpar jtext()
    public void limpiarjtex(){
        this.pcodigo.setText("");
        this.pnombre.setText("");
        this.jtdebe.setText("");
        this.jthaber.setText("");
        fechaA.setCalendar(null);
    }
    //vaciar tabla
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) tasiento.getModel();
        int a = tasiento.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
         tb.removeRow(tb.getRowCount()-1);
        }
        //cargaTicket();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtcodigoC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtdebe = new javax.swing.JTextField();
        jthaber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasiento = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tcodigos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pcodigo = new javax.swing.JTextField();
        pnombre = new javax.swing.JTextField();
        fechaA = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(900, 564));

        jLabel1.setText("Nombre de empresa");

        jLabel2.setText("Codigo");

        jtcodigoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcodigoCActionPerformed(evt);
            }
        });
        jtcodigoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtcodigoCKeyTyped(evt);
            }
        });

        jLabel3.setText("debe");

        jLabel4.setText("haber");

        jthaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jthaberActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        tasiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tasiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Cuenta", "nombre", "Debe", "Heber", "fecha", "eliminar"
            }
        ));
        tasiento.setCellSelectionEnabled(true);
        tasiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tasiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tasiento);

        jToggleButton1.setText("Terminar Asiento contable");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        tcodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nombre"
            }
        ));
        tcodigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcodigosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tcodigos);

        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pcodigo.setEditable(false);

        pnombre.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombreE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtdebe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jthaber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(fechaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtcodigoC, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButton1))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtcodigoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtdebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jthaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jToggleButton1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtcodigoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcodigoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcodigoCActionPerformed

    private void jtcodigoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtcodigoCKeyTyped
        // TODO add your handling code here:
         jtcodigoC.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jtcodigoC.getText(),1));//To change body of generated methods, choose Tools | Templates.
            }

        });
        
        trs = new TableRowSorter(jtModelo =  (DefaultTableModel) tcodigos.getModel());
        tcodigos.setRowSorter(trs);
    }//GEN-LAST:event_jtcodigoCKeyTyped

    private void tasientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasientoMouseClicked
        // TODO add your handling code here:
       
        int column = tasiento.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tasiento.getRowHeight();
        
        if(row < tasiento.getRowCount() && row >= 0 && column < tasiento.getColumnCount() && column >= 0){
            Object value = tasiento.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                if(boton.getName().equals("m")){
                    int a= JOptionPane.showConfirmDialog(null, "Desea editar este registro", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    if(a==JOptionPane.OK_OPTION){
                        
                    jtModelo1.removeRow(tasiento.getSelectedRow());   
                    
                    }                    //EVENTOS MODIFICAR
                }
                if(boton.getName().equals("e")){
                      int a= JOptionPane.showConfirmDialog(null, "Desea eliminar este registro", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    if(a==JOptionPane.OK_OPTION){
                    jtModelo1.removeRow(tasiento.getSelectedRow());   
                    
                    }
                    //EVENTOS ELIMINAR
                }
            }
            if(value instanceof JCheckBox){
                //((JCheckBox)value).doClick();
                JCheckBox ch = (JCheckBox)value;
                if(ch.isSelected()==true){
                    ch.setSelected(false);
                }
                if(ch.isSelected()==false){
                    ch.setSelected(true);
                }
                
            }
        }
    }//GEN-LAST:event_tasientoMouseClicked

    private void jthaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jthaberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jthaberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tasiento.setDefaultRenderer(Object.class, new Render());

        vcodigo=this.pcodigo.getText();
        vnombre=this.pnombre.getText();
        vdebe=this.jtdebe.getText();
        vhaber=this.jthaber.getText();
        int año = fechaA.getCalendar().get(Calendar.YEAR);
        int mes = fechaA.getCalendar().get(Calendar.MARCH);
        int dia = fechaA.getCalendar().get(Calendar.DAY_OF_MONTH);
        vfecha =(año+"-"+mes+"-"+dia);
        
        if(vcodigo.isEmpty()||vnombre.isEmpty()||vfecha.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Llene todos los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }else{
            JButton btn2 = new JButton("Eliminar");
            btn2.setName("e");

            jtModelo1.addRow(new Object[]{
                vcodigo,vnombre,vdebe,vhaber,vfecha,btn2
            });
            this.limpiarjtex();
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tcodigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcodigosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tcodigosMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
            Conector cc = new Conector();
            Connection cn = cc.conectar();
            String consult = "insert into asiento(debe,haber,codigo,nombrec,nasiento,fecha) values(?,?,?,?,?,?)";
            String qry = "SELECT nasiento FROM asiento ORDER BY  nasiento DESC LIMIT 1";
        try {
            Statement stmt = cn.createStatement();
             ResultSet rs  = stmt.executeQuery(qry);
             System.out.println("aqui");
             int numecoAsiento= rs.getInt("nasiento");             
             numecoAsiento=numecoAsiento+1;
        
            if (tasiento.getRowCount() == 0) {
               JOptionPane.showMessageDialog(null, "No Existen Datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {                
                for (int i = 0; i < tasiento.getRowCount(); i++) {
                    vcodigo=(String) tasiento.getValueAt(i, 0);
                    vnombre=(String) tasiento.getValueAt(i, 1);
                    vdebe=(String) tasiento.getValueAt(i, 2);
                    vhaber=(String) tasiento.getValueAt(i, 3);
                    vfecha=(String) tasiento.getValueAt(i, 4);
                    //vnumeroAsiento = (String) tasiento.getValueAt(i, 5);

                  PreparedStatement ps = cn.prepareStatement(consult);

                  if(vhaber.isEmpty()){
                    System.out.println("entro en debe");
                    ps.setDouble(1, Double.parseDouble(vdebe));
                    ps.setDouble(2, 0.0);
                    ps.setInt(3, Integer.parseInt(vcodigo));
                    ps.setString(4, vnombre);
                    ps.setInt(5, numecoAsiento);
                    ps.setString(6,vfecha);



                  }
                  else if(vdebe.isEmpty()){
                        System.out.println("entro en haber");

                        ps.setDouble(1, 0.0);
                        ps.setDouble(2, Double.parseDouble(vhaber));
                        ps.setInt(3, Integer.parseInt(vcodigo));
                        ps.setString(4, vnombre);
                        ps.setInt(5, numecoAsiento);
                        ps.setString(6,vfecha);

                  }
                  else{
                      System.out.println("error no entro");
                  }
                  ps.executeUpdate();


                }
            JOptionPane.showMessageDialog(null,"Asiento Guardado con exito.","Con exito",JOptionPane.INFORMATION_MESSAGE);

             
           }

        } catch ( Exception e ) {

          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }

        this.limpiarjtex();
        this.eliminar();
        cc.close();
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jtcodigoC;
    private javax.swing.JTextField jtdebe;
    private javax.swing.JTextField jthaber;
    private javax.swing.JTextField nombreE;
    private javax.swing.JTextField pcodigo;
    private javax.swing.JTextField pnombre;
    private javax.swing.JTable tasiento;
    private javax.swing.JTable tcodigos;
    // End of variables declaration//GEN-END:variables
}
