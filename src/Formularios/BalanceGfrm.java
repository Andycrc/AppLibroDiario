/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Conector;
import Entidades.Dcatalogo;
import Models.AsientoModel;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Andy
 */
public class BalanceGfrm extends javax.swing.JPanel {

    Dcatalogo archivo = new Dcatalogo();
    DefaultTableModel jtModelo;
    ArrayList<String> datos;
    TableRowSorter trs;
    AsientoModel cn;
    public BalanceGfrm() throws SQLException {
        initComponents();
        jtModelo = (DefaultTableModel) this.jTable1.getModel();
        cn = new AsientoModel();
        btnExport.setEnabled(false);

//        this.cargarDatos();   
    }
//    public void cargarDatos() throws SQLException 
//    {
//        jtModelo = cn.obtenerDatos();
//        this.jTable1.setModel(jtModelo);
//        this.jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//        //this.jTable1.setFillsViewportHeight(true);
//        
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 36)); // NOI18N
        jLabel1.setText("Balance general");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Hasta");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExport.setText("Exportar Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Concepto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Movimientos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Saldos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3)
                .addGap(187, 187, 187)
                .addComponent(jLabel4)
                .addGap(181, 181, 181)
                .addComponent(jLabel5)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cuenta", "Debe", "Haber", "Debe", "Haber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(btnExport))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133)))
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnExport))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (fecha1.getDate() == null || fecha2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor verifique su fecha.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
             this.eliminar();
        Conector cc = new Conector();
        Connection cn = cc.conectar();
        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
        String filtrof1 = DateFor.format(fecha1.getDate());
        String filtrof2 = DateFor.format(fecha2.getDate());
        String consultafiltra = "SELECT codigo,nombrec,fecha,debe,haber FROM asiento  WHERE fecha BETWEEN '" + filtrof1 + "' AND '" + filtrof2 + "' order by codigo";
        ArrayList<String> lista = new ArrayList<>();
        String datos1, nasiento, cuenta = "", debe, haber, fecha;
        int codigoA = 0;
        int codigoB = 0;
        int movimientoD = 0;
        int movimientoH = 0;
        int saldoFH = 0;
        int saldoFD = 0;
        int tmovimientoD = 0;
        int tmovimientoH = 0;
        int tsaldoFD = 0;
        int tsaldoFH = 0;

        try {
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(consultafiltra);
            String[] datosN = new String[4];
            int Bandera = 0;
            while (rs.next()) {
                codigoA = codigoB;
                codigoB = rs.getInt("codigo");

                if (Bandera == 0) {
                    Bandera++;
                    cuenta = rs.getString("nombrec");
                    movimientoD = movimientoD + rs.getInt("debe");
                    movimientoH = movimientoH + rs.getInt("haber");

                } else {
                    if (codigoA == codigoB) {
                        movimientoD = movimientoD + rs.getInt("debe");
                        movimientoH = movimientoH + rs.getInt("haber");
                    } else {
                        if (movimientoD > movimientoH) {
                            debe = Integer.toString(movimientoD);
                            tmovimientoD = tmovimientoD + movimientoD;
                            haber = Integer.toString(movimientoH);
                            tmovimientoH = tmovimientoH + movimientoH;
                            saldoFD = movimientoD - movimientoH;
                            tsaldoFD = tsaldoFD + saldoFD;
                            datos1 = (codigoB + "," + cuenta + "," + debe + "," + haber + "," + saldoFD + "," + " ");
                            lista.add(datos1);

                        } else {
                            debe = Integer.toString(movimientoD);
                            tmovimientoD = tmovimientoD + movimientoD;
                            haber = Integer.toString(movimientoH);
                            tmovimientoH = tmovimientoH + movimientoH;
                            saldoFH = movimientoH - movimientoD;
                            tsaldoFH = tsaldoFH + saldoFH;
                            datos1 = (codigoB + "," + cuenta + "," + debe + "," + haber + "," + " " + "," + saldoFH);
                            lista.add(datos1);

                        }
                        movimientoD = 0;
                        movimientoH = 0;
                        movimientoD = movimientoD + rs.getInt("debe");
                        movimientoH = movimientoH + rs.getInt("haber");
                        cuenta = rs.getString("nombrec");
                    }
                }
            }
            if (movimientoD > movimientoH) {
                debe = Integer.toString(movimientoD);
                tmovimientoD = tmovimientoD + movimientoD;
                haber = Integer.toString(movimientoH);
                tmovimientoH = tmovimientoH + movimientoH;
                saldoFD = movimientoD - movimientoH;
                tsaldoFD = tsaldoFD + saldoFD;
                datos1 = (codigoB + "," + cuenta + "," + debe + "," + haber + "," + saldoFD + "," + " ");
                lista.add(datos1);

            } else {
                debe = Integer.toString(movimientoD);
                tmovimientoD = tmovimientoD + movimientoD;
                haber = Integer.toString(movimientoH);
                tmovimientoH = tmovimientoH + movimientoH;
                saldoFH = movimientoH - movimientoD;
                tsaldoFH = tsaldoFH + saldoFH;
                datos1 = (codigoB + "," + cuenta + "," + debe + "," + haber + "," + " " + "," + saldoFH);
                lista.add(datos1);

            }
            datos1 = ("Total" + "," + "" + "," + tmovimientoD + "," + tmovimientoH + "," + tsaldoFD + "," + tsaldoFH);
            lista.add(datos1);
              btnExport.setEnabled(true);

             Dashboard ds = new Dashboard();
             
             String[] columnNames = {"Empresa",ds.empresa, " Desde",filtrof1, " hasta", filtrof2};
             jtModelo.setColumnIdentifiers(columnNames);
             jtModelo.addRow(new Object[]{"","Concepto","Movimientos","","Saldos",""});
             jtModelo.addRow(new Object[]{"Codigo","Cuenta","Debe","Haber","Debe","Haber"});
            for (int i = 0; i <= lista.size(); i++) {
                datosN = lista.get(i).split(",");

                
                jtModelo.addRow(datosN);

            }

            jTable1.setModel(jtModelo);

        } catch (Exception e) {

            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

        cc.close();
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    public void exportarExcel(JTable t) throws IOException {
        Dashboard ds = new Dashboard();
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Balance General "+ds.empresa);
                hoja.setDisplayGridlines(true);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        try {

            exportarExcel(jTable1);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportActionPerformed

    public void eliminar() {
        jtModelo.getDataVector().removeAllElements();
        jtModelo.fireTableDataChanged();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
