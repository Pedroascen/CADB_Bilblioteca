/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.UsuarioDataLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Ascencio
 */
public class Home extends javax.swing.JFrame {
    
    //instacias de objetos
    RegistroUsuario frmRegistro;
    UsuarioDataLogin usrlog = new UsuarioDataLogin();
    
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Home(UsuarioDataLogin usrlog) {
        this.usrlog = usrlog;
        //JOptionPane.showMessageDialog(null, "Bienvenido: " + usrlog.getNombre_TipoUser()); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        setLocationRelativeTo(null);
        lbTipoUsuario.setText(usrlog.getNombre_TipoUser());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JPanel();
        lblCerrarSesion = new javax.swing.JLabel();
        btnPrestamos = new javax.swing.JPanel();
        lblPrestamos = new javax.swing.JLabel();
        btnListaEjemplares = new javax.swing.JPanel();
        lblListaEjemplares = new javax.swing.JLabel();
        btnDevoluciones = new javax.swing.JPanel();
        lblDevoluciones = new javax.swing.JLabel();
        btnAgregarEjemplar = new javax.swing.JPanel();
        lblAgregarEjemplar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelBienvenida = new javax.swing.JLabel();
        lbTipoUsuario = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        iconAgregarUsuario = new javax.swing.JLabel();
        iconAdministrarUsuarios = new javax.swing.JLabel();
        btnAgregarUsuario = new javax.swing.JPanel();
        lblAgregarUsuario = new javax.swing.JLabel();
        btnAdministrarUsuario = new javax.swing.JPanel();
        lblAdministrarUsuario = new javax.swing.JLabel();
        labelBienvenida1 = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(23, 59, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarSesion.setBackground(new java.awt.Color(28, 70, 120));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
        });

        lblCerrarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_logout_20px.png"))); // NOI18N
        lblCerrarSesion.setText("Cerrar sesión");
        lblCerrarSesion.setIconTextGap(6);
        lblCerrarSesion.setInheritsPopupMenu(false);

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarSesionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCerrarSesion)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 48));

        btnPrestamos.setBackground(new java.awt.Color(28, 70, 120));
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblPrestamos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        lblPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        lblPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_borrow_book_15px.png"))); // NOI18N
        lblPrestamos.setText("Préstamos");
        lblPrestamos.setIconTextGap(6);

        javax.swing.GroupLayout btnPrestamosLayout = new javax.swing.GroupLayout(btnPrestamos);
        btnPrestamos.setLayout(btnPrestamosLayout);
        btnPrestamosLayout.setHorizontalGroup(
            btnPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPrestamosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        btnPrestamosLayout.setVerticalGroup(
            btnPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 48));

        btnListaEjemplares.setBackground(new java.awt.Color(28, 70, 120));
        btnListaEjemplares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaEjemplares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListaEjemplaresMousePressed(evt);
            }
        });

        lblListaEjemplares.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        lblListaEjemplares.setForeground(new java.awt.Color(255, 255, 255));
        lblListaEjemplares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_menu_15px.png"))); // NOI18N
        lblListaEjemplares.setText("Consulta de ejemplares");
        lblListaEjemplares.setIconTextGap(6);

        javax.swing.GroupLayout btnListaEjemplaresLayout = new javax.swing.GroupLayout(btnListaEjemplares);
        btnListaEjemplares.setLayout(btnListaEjemplaresLayout);
        btnListaEjemplaresLayout.setHorizontalGroup(
            btnListaEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListaEjemplaresLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblListaEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        btnListaEjemplaresLayout.setVerticalGroup(
            btnListaEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnListaEjemplaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnListaEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 48));

        btnDevoluciones.setBackground(new java.awt.Color(28, 70, 120));
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblDevoluciones.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        lblDevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        lblDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_return_book_15px.png"))); // NOI18N
        lblDevoluciones.setText("Devoluciones");
        lblDevoluciones.setIconTextGap(6);

        javax.swing.GroupLayout btnDevolucionesLayout = new javax.swing.GroupLayout(btnDevoluciones);
        btnDevoluciones.setLayout(btnDevolucionesLayout);
        btnDevolucionesLayout.setHorizontalGroup(
            btnDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDevolucionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDevoluciones)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        btnDevolucionesLayout.setVerticalGroup(
            btnDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDevolucionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnDevoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 48));

        btnAgregarEjemplar.setBackground(new java.awt.Color(28, 70, 120));
        btnAgregarEjemplar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEjemplar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarEjemplarMousePressed(evt);
            }
        });

        lblAgregarEjemplar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        lblAgregarEjemplar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarEjemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_add_20px.png"))); // NOI18N
        lblAgregarEjemplar.setText("Agregar nuevo ejemplar");
        lblAgregarEjemplar.setIconTextGap(6);

        javax.swing.GroupLayout btnAgregarEjemplarLayout = new javax.swing.GroupLayout(btnAgregarEjemplar);
        btnAgregarEjemplar.setLayout(btnAgregarEjemplarLayout);
        btnAgregarEjemplarLayout.setHorizontalGroup(
            btnAgregarEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarEjemplarLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblAgregarEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        btnAgregarEjemplarLayout.setVerticalGroup(
            btnAgregarEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarEjemplarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregarEjemplar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnAgregarEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 48));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        labelBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(23, 59, 102));

        lbTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbTipoUsuario.setForeground(new java.awt.Color(23, 59, 102));

        jPanel6.setBackground(new java.awt.Color(28, 70, 120));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        iconAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_add_user_group_woman_man_skin_type_7_100px.png"))); // NOI18N

        iconAdministrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_male_female_user_group_100px.png"))); // NOI18N

        btnAgregarUsuario.setBackground(new java.awt.Color(28, 70, 120));
        btnAgregarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarUsuarioMousePressed(evt);
            }
        });

        lblAgregarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarUsuario.setText("Agregar usuario");
        lblAgregarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnAgregarUsuarioLayout = new javax.swing.GroupLayout(btnAgregarUsuario);
        btnAgregarUsuario.setLayout(btnAgregarUsuarioLayout);
        btnAgregarUsuarioLayout.setHorizontalGroup(
            btnAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAgregarUsuarioLayout.setVerticalGroup(
            btnAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        btnAdministrarUsuario.setBackground(new java.awt.Color(28, 70, 120));
        btnAdministrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdministrarUsuarioMousePressed(evt);
            }
        });

        lblAdministrarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblAdministrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrarUsuario.setText("Administrar usuario");
        lblAdministrarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnAdministrarUsuarioLayout = new javax.swing.GroupLayout(btnAdministrarUsuario);
        btnAdministrarUsuario.setLayout(btnAdministrarUsuarioLayout);
        btnAdministrarUsuarioLayout.setHorizontalGroup(
            btnAdministrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdministrarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdministrarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAdministrarUsuarioLayout.setVerticalGroup(
            btnAdministrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdministrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        labelBienvenida1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelBienvenida1.setForeground(new java.awt.Color(23, 59, 102));
        labelBienvenida1.setText("Bienvenido: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelBienvenida1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelBienvenida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(iconAgregarUsuario)
                        .addGap(111, 111, 111)
                        .addComponent(iconAdministrarUsuarios))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnAdministrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelBienvenida1)
                        .addComponent(labelBienvenida))
                    .addComponent(lbTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconAdministrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, -10, 700, 510));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_test_account_110px_2.png"))); // NOI18N
        jPanel1.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioMousePressed
        // TODO add your handling code here:
        //muestra formulario para agregar user
        if(frmRegistro==null){
            frmRegistro = new RegistroUsuario(usrlog);
            frmRegistro.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnAgregarUsuarioMousePressed

    private void btnAdministrarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrarUsuarioMousePressed
        // TODO add your handling code here:
        dispose();
        AdministrarUsuario administrar = new AdministrarUsuario();
        administrar.setVisible(true);
        
        
    }//GEN-LAST:event_btnAdministrarUsuarioMousePressed

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);
           
        
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    private void btnListaEjemplaresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaEjemplaresMousePressed
        // TODO add your handling code here:
        dispose();
        Lista lista = new Lista();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaEjemplaresMousePressed

    private void btnAgregarEjemplarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEjemplarMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarEjemplar agregar = new AgregarEjemplar();
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarEjemplarMousePressed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAdministrarUsuario;
    private javax.swing.JPanel btnAgregarEjemplar;
    private javax.swing.JPanel btnAgregarUsuario;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnDevoluciones;
    private javax.swing.JPanel btnListaEjemplares;
    private javax.swing.JPanel btnPrestamos;
    private javax.swing.JLabel iconAdministrarUsuarios;
    private javax.swing.JLabel iconAgregarUsuario;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelBienvenida1;
    private javax.swing.JLabel lbTipoUsuario;
    private javax.swing.JLabel lblAdministrarUsuario;
    private javax.swing.JLabel lblAgregarEjemplar;
    private javax.swing.JLabel lblAgregarUsuario;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDevoluciones;
    private javax.swing.JLabel lblListaEjemplares;
    private javax.swing.JLabel lblPrestamos;
    // End of variables declaration//GEN-END:variables
}
