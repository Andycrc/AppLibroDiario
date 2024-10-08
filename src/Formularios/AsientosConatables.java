/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Conector;
import Entidades.Dcatalogo;
import static Formularios.mainInicio.contenedor;
import Models.AsientoModel;
import java.awt.BorderLayout;
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
public final class AsientosConatables extends javax.swing.JPanel {

    Dcatalogo archivo = new Dcatalogo();
    DefaultTableModel jtModelo;
    ArrayList<String> datos;
    TableRowSorter trs;
    AsientoModel cn;

    public AsientosConatables() throws SQLException {
        initComponents();

        jtModelo = (DefaultTableModel) this.tablaAs.getModel();
        cn = new AsientoModel();
        this.cargarDatos();
        this.brnExport.setEnabled(false);
    }

    public void imprimripdf() {

    }

    public void cargarDatos() throws SQLException {

        jtModelo = cn.obtenerDatos();
        this.tablaAs.setModel(jtModelo);
        this.tablaAs.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAs = new javax.swing.JTable();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btn_filtrar = new javax.swing.JButton();
        brnExport = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 36)); // NOI18N
        jLabel1.setText("Resumen de Asientos ");

        tablaAs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaAs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Asiento", "Codigo", "Cuenta", "Debe", "Haber", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAs);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Hasta");

        btn_filtrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_filtrar.setText("Filtrar");
        btn_filtrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_filtrarMouseClicked(evt);
            }
        });
        btn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarActionPerformed(evt);
            }
        });

        brnExport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        brnExport.setText("Exportar Excel");
        brnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnExportActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Nuevo Asiento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Iniciar nuevo libro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btn_filtrar)
                                .addGap(28, 28, 28)
                                .addComponent(brnExport)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_filtrar)
                        .addComponent(brnExport)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.out.println("hola");
        asientoContable newasiento = new asientoContable();
        newasiento.setSize(900, 540);
        newasiento.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(newasiento, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        if (fecha1.getDate() == null || fecha2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor verifique su fecha.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            this.eliminar();
            Conector cc = new Conector();
            Connection cn = cc.conectar();

            SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
            String filtrof1 = DateFor.format(fecha1.getDate());
            String filtrof2 = DateFor.format(fecha2.getDate());

            String consultafiltra = "SELECT nasiento,codigo,nombrec,debe,haber,fecha,comentario FROM asiento WHERE fecha BETWEEN '" + filtrof1 + "' AND '" + filtrof2 + "'";
            System.out.println("consulta a BD: " + consultafiltra);
            ArrayList<String> lista = new ArrayList<>();
            try {
                Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery(consultafiltra);
                String[] datosN = new String[40];
                while (rs.next()) {
                    String datos1, nasiento, codigo, cuenta, debe, haber, fecha, comentario;
                    nasiento = Integer.toString(rs.getInt("nasiento"));
                    codigo = Integer.toString(rs.getInt("codigo"));
                    cuenta = rs.getString("nombrec");
                    debe = Integer.toString(rs.getInt("debe"));
                    haber = Integer.toString(rs.getInt("haber"));
                    fecha = rs.getString("fecha");
                    comentario = rs.getString("comentario");

                    datos1 = (nasiento + "," + codigo + "," + cuenta + "," + comentario + "," + debe + "," + haber + "," + fecha);
                    lista.add(datos1);
                }

                brnExport.setEnabled(true);

                //Dashboard ds = new Dashboard();
                String[] columnNames = {"Empresa " + Dashboard.empresa, " Desde" + filtrof1, " hasta" + filtrof2, " ", " ", " ", " "};
                jtModelo.setColumnIdentifiers(columnNames);
                jtModelo.addRow(new Object[]{"N°Asiento", "Codigo", "Cuenta", "Comentario", "Debe", "Haber", "Fecha"});

                for (int i = 0; i <= lista.size(); i++) {//obtine la cantidad de filas
                    datosN = lista.get(i).split(",");
                    jtModelo.addRow(datosN);

                }

                tablaAs.setModel(jtModelo);
            } catch (SQLException e) {

                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }

            cc.close();
        }

    }//GEN-LAST:event_btn_filtrarActionPerformed


    private void btn_filtrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtrarMouseClicked
    }//GEN-LAST:event_btn_filtrarMouseClicked

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
                Sheet hoja = libro.createSheet("Asientos Contables " + ds.empresa);
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


    private void brnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnExportActionPerformed
        try {
            exportarExcel(tablaAs);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

    }//GEN-LAST:event_brnExportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
     
        Conector cc = new Conector();
        Connection cn = cc.conectar();
       try{
           int confirmado = JOptionPane.showConfirmDialog(this,
            "¿Estas seguro?");
         if (JOptionPane.OK_OPTION == confirmado){
           String qry1 = "UPDATE asiento set nasiento = 0 ";
           String qry2 = "DELETE from asiento where id != 0 ";
           Statement st = cn.createStatement();
           st.addBatch(qry1);
           st.addBatch(qry2);
           st.executeBatch();
           this.cargarDatos();
           JOptionPane.showMessageDialog(this, "Libro nuevo iniciado");
         }   
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       cc.close();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void eliminar() {
        jtModelo.getDataVector().removeAllElements();
        jtModelo.fireTableDataChanged();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnExport;
    private javax.swing.JButton btn_filtrar;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAs;
    // End of variables declaration//GEN-END:variables
}
