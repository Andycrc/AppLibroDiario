/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Conector;
import Entidades.Dcatalogo;
import Entidades.Render;
import static Formularios.Dashboard.content;
import static Formularios.mainInicio.contenedor;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static com.sun.jmx.remote.internal.IIOPHelper.connect;
import java.awt.BorderLayout;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
      int cont=0;
      


    /**
     * Creates new form asientoContable
     */
    public asientoContable() {
        initComponents();
        jtModelo = (DefaultTableModel) this.tcodigos.getModel();   
        jtModelo1 = (DefaultTableModel) this.tasiento.getModel();   
        this.cargarParametros();
        this.cargarT2();
        jtdebe.setEnabled(false);
        jthaber.setEnabled(false);


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
//        fechaA.setCalendar(null);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasiento = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tcodigos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pcodigo = new javax.swing.JTextField();
        pnombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtcodigoC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fechaA = new com.toedter.calendar.JDateChooser();
        jtdebe = new javax.swing.JTextField();
        jthaber = new javax.swing.JTextField();
        btndebe = new javax.swing.JRadioButton();
        btnhaber = new javax.swing.JRadioButton();
        jTcomentario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 564));

        tasiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tasiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Cuenta", "Nombre Cuenta", "Debe", "Heber", "Fecha", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tasiento.setCellSelectionEnabled(true);
        tasiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tasiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tasiento);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tcodigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcodigosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tcodigos);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pcodigo.setEditable(false);

        pnombre.setEditable(false);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Ver Asiento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        jLabel2.setText("Buscar:");

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

        jLabel5.setText("Fecha:");

        jthaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jthaberActionPerformed(evt);
            }
        });

        buttonGroup2.add(btndebe);
        btndebe.setText("Debe:");
        btndebe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndebe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndebeMouseClicked(evt);
            }
        });

        buttonGroup2.add(btnhaber);
        btnhaber.setText("Haber:");
        btnhaber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhaberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtcodigoC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnhaber)
                            .addComponent(btndebe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtdebe, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5)
                                .addGap(45, 52, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jthaber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(fechaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtcodigoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtdebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndebe))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jthaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhaber))))
                .addContainerGap())
        );

        jLabel1.setText("Comentario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTcomentario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTcomentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
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
        if(cont<1){
                SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
                vfecha = DateFor.format(fechaA.getDate());
                fechaA.setEnabled(false);
                
                jTcomentario.setEnabled(false);
        
        }
        double vvdebe,vvhaber;
        vvdebe=Double.valueOf(vdebe);
        vvhaber=Double.valueOf(vhaber);
        System.out.println(""+vvdebe+""+vvhaber);



     
        if(vcodigo.isEmpty()||vnombre.isEmpty()||vfecha.isEmpty()||(jTcomentario.getText().trim().length()==0) ){
                        JOptionPane.showMessageDialog(null, "Llene todos los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        jTcomentario.setEnabled(true);
                        fechaA.setEnabled(true);

        }else{
          if(vvdebe<0 || vvhaber<0){
              System.out.println("entre a numero nega");
           JOptionPane.showMessageDialog(null, "Los valores no deben ser negativos", "Advertencia", JOptionPane.WARNING_MESSAGE);
          }else{
            JButton btn2 = new JButton("Eliminar");
            btn2.setName("e");

            jtModelo1.addRow(new Object[]{
                vcodigo,vnombre,vdebe,vhaber,vfecha,btn2
            });
            this.limpiarjtex();       
            cont++;
          
          }

        }

        


        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tcodigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcodigosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tcodigosMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        cont=0;
        String comentario = jTcomentario.getText();

            Conector cc = new Conector();
            Connection cn = cc.conectar();
            String consult = "insert into asiento(debe,haber,codigo,nombrec,nasiento,fecha,comentario) values(?,?,?,?,?,?,?)";
            String qry = "SELECT nasiento FROM asiento ORDER BY  nasiento DESC LIMIT 1";
        double sumH=0,sumD=0;

        for (int i = 0; i < tasiento.getRowCount(); i++) {
             sumH=sumH+Double.valueOf((String)tasiento.getValueAt(i, 3));      
          sumD=sumD+Double.valueOf((String)tasiento.getValueAt(i, 2));   

        }
        if(sumH==sumD){
         try {
            Statement stmt = cn.createStatement();
             ResultSet rs  = stmt.executeQuery(qry);
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

                  if("0".equals(vhaber)){
                    System.out.println("entro en debe");
                    ps.setDouble(1, Double.parseDouble(vdebe));
                    ps.setDouble(2, 0.0);
                    ps.setInt(3, Integer.parseInt(vcodigo));
                    ps.setString(4, vnombre);
                    ps.setInt(5, numecoAsiento);
                    ps.setString(6,vfecha);
                    ps.setString(7, jTcomentario.getText());



                  }
                  else if("0".equals(vdebe)){
                        System.out.println("entro en haber");

                        ps.setDouble(1, 0.0);
                        ps.setDouble(2, Double.parseDouble(vhaber));
                        ps.setInt(3, Integer.parseInt(vcodigo));
                        ps.setString(4, vnombre);
                        ps.setInt(5, numecoAsiento);
                        ps.setString(6,vfecha);
                        ps.setString(7, jTcomentario.getText());

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
        
        fechaA.setEnabled(true);
        fechaA.setCalendar(null);
        jTcomentario.setEnabled(true);

        this.limpiarjtex();
        this.eliminar();
        cc.close();
            
        }else{
           JOptionPane.showMessageDialog(null, "La suma en debe y el haber no cuadran.", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }




        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                     AsientosConatables  newasiento = null;
          try {
              newasiento = new AsientosConatables();
          } catch (SQLException ex) {
              Logger.getLogger(asientoContable.class.getName()).log(Level.SEVERE, null, ex);
          }
                newasiento.setSize(900, 540);
                 newasiento.setLocation(0,0);
                contenedor.removeAll();
             contenedor.add(newasiento, BorderLayout.CENTER);
             contenedor.revalidate();
             contenedor.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btndebeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndebeMouseClicked
        // TODO add your handling code here:
        jtdebe.setEnabled(true);
        jthaber.setText("0");
        jthaber.setEnabled(false);

    }//GEN-LAST:event_btndebeMouseClicked

    private void btnhaberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhaberMouseClicked
        // TODO add your handling code here:
        jthaber.setEnabled(true);
        jtdebe.setText("0");
        jtdebe.setEnabled(false);

    }//GEN-LAST:event_btnhaberMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btndebe;
    private javax.swing.JRadioButton btnhaber;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser fechaA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTcomentario;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jtcodigoC;
    private javax.swing.JTextField jtdebe;
    private javax.swing.JTextField jthaber;
    private javax.swing.JTextField pcodigo;
    private javax.swing.JTextField pnombre;
    private javax.swing.JTable tasiento;
    private javax.swing.JTable tcodigos;
    // End of variables declaration//GEN-END:variables
}
