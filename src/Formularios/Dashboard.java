package Formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;



public class Dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    private int annio;
    private String mes;   
    Calendar fecha = new GregorianCalendar();
    int dia = fecha.get(Calendar.DAY_OF_MONTH);
    String MES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    Calendar c1 = Calendar.getInstance();
    public static String empresa;
  
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        obtenerMesAño();
        this.jLabel6.setText("Fecha: " + dia +  " de "+mes+" "+annio);
         this.principal();
         
         
         
    }
    public void principal(){
//        Home hm1 = new Home();
//        hm1.setSize(900, 540);
//        hm1.setLocation(0,0);
//        content.removeAll();
//        content.add(hm1, BorderLayout.CENTER);
//        content.revalidate();
//        content.repaint();        
    }
    
    
    public void obtenerMesAño() {
        annio = c1.get(Calendar.YEAR);
        mes = MES[c1.get(Calendar.MONTH)];

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_users = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_books = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_reports = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_reports1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jtEmpresa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(204, 204, 204));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(51, 153, 255));

        red_squr.setBackground(new java.awt.Color(25, 118, 210));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 102, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 51, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(red_squrLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(red_squrLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 90));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(51, 51, 51));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(51, 102, 255));
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });
        btn_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Iniciar");
        btn_home.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home-outline.png"))); // NOI18N
        btn_home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, 30));

        Menu.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 270, 50));

        btn_users.setBackground(new java.awt.Color(0, 153, 51));
        btn_users.setToolTipText("");
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_users.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usersMousePressed(evt);
            }
        });
        btn_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mayorisaciòn");
        btn_users.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/file-chart.png"))); // NOI18N
        btn_users.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        btn_books.setBackground(new java.awt.Color(0, 153, 51));
        btn_books.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_books.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_booksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_booksMousePressed(evt);
            }
        });
        btn_books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Balance");
        btn_books.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/file-chart.png"))); // NOI18N
        btn_books.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        btn_reports.setBackground(new java.awt.Color(0, 153, 51));
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportsMousePressed(evt);
            }
        });
        btn_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Exit");
        btn_reports.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("X");
        btn_reports.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1170, 20));

        btn_reports1.setBackground(new java.awt.Color(0, 153, 51));
        btn_reports1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports1.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reports1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reports1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reports1MousePressed(evt);
            }
        });
        btn_reports1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("...");
        btn_reports1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/book-open-page-variant.png"))); // NOI18N
        btn_reports1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_reports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jtEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtEmpresa.setText("UNICAES");
        jtEmpresa.setToolTipText("");
        jtEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtEmpresa.setName(""); // NOI18N
        Menu.add(jtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 320, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("INGRESE EL NOMBRE DE SU EMPRESA:");
        Menu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 340, 30));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 1180, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void btn_usersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMousePressed
//        Mayori may =null;
//        try {
//            may = new Mayori();
//        } catch (SQLException ex) {
//            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        may.setSize(900, 540);
//        may.setLocation(0, 0);
//        this.content.removeAll();
//        content.add(may, BorderLayout.CENTER);
//        content.revalidate();
//        content.repaint();
        
        
    }//GEN-LAST:event_btn_usersMousePressed

    private void btn_booksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMousePressed
//        BalanceGfrm balance=null;
//        try {
//            balance = new BalanceGfrm();
//        } catch (SQLException ex) {
//            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        balance.setSize(900, 540);
//        balance.setLocation(0, 0);
//        this.content.removeAll();
//        content.add(balance, BorderLayout.CENTER);
//        content.revalidate();
//        content.repaint();
    }//GEN-LAST:event_btn_booksMousePressed

    private void btn_reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMousePressed

    }//GEN-LAST:event_btn_reportsMousePressed

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    private void btn_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseEntered
        if(btn_users.getBackground().getRGB() == -15574355)
            setColor(btn_users);
    }//GEN-LAST:event_btn_usersMouseEntered

    private void btn_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseExited
//        if(btn_lends.getBackground().getRGB() != -15574355 || btn_home.getBackground().getRGB() != -15574355
//            || btn_asientoC.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
//            resetColor(btn_users);
    }//GEN-LAST:event_btn_usersMouseExited

    private void btn_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseEntered
        if(btn_books.getBackground().getRGB() == -15574355)
            setColor(btn_books);
    }//GEN-LAST:event_btn_booksMouseEntered

    private void btn_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseExited
//        if(btn_lends.getBackground().getRGB() != -15574355 || btn_home.getBackground().getRGB() != -15574355
//            || btn_asientoC.getBackground().getRGB() != -15574355 || btn_users.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
//            resetColor(btn_books);
    }//GEN-LAST:event_btn_booksMouseExited

    private void btn_reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseEntered
        if(btn_reports.getBackground().getRGB() == -15574355)
            setColor(btn_reports);
    }//GEN-LAST:event_btn_reportsMouseEntered

    private void btn_reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseExited
//        if(btn_lends.getBackground().getRGB() != -15574355 || btn_home.getBackground().getRGB() != -15574355
//            || btn_asientoC.getBackground().getRGB() != -15574355 || btn_users.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355)
//            resetColor(btn_reports);
    }//GEN-LAST:event_btn_reportsMouseExited

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(25,118,210));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void btn_reports1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MouseEntered

    private void btn_reports1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MouseExited

    private void btn_reports1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MousePressed

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed

        empresa = jtEmpresa.getText();
        mainInicio menu = new mainInicio();
//        emp.setSize(1200, 590);
//        emp.setLocation(0, 0);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
//        if(btn_lends.getBackground().getRGB() != -15574355 || btn_asientoC.getBackground().getRGB() != -15574355
//            || btn_users.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
//        resetColor(btn_home);
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        if(btn_home.getBackground().getRGB() == -15574355)
        setColor(btn_home);
    }//GEN-LAST:event_btn_homeMouseEntered

    
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JPanel btn_books;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_reports;
    private javax.swing.JPanel btn_reports1;
    private javax.swing.JPanel btn_users;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField jtEmpresa;
    private javax.swing.JPanel red_squr;
    // End of variables declaration//GEN-END:variables
}
