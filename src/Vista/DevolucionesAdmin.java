/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.DevolucionCtrl;

/**
 *
 * @author Jazmine
 */
public class DevolucionesAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DevolucionesAdmin
     */
    public DevolucionesAdmin() {
        initComponents();
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
        btnHome = new javax.swing.JPanel();
        lblListaEjemplares1 = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        labelBienvenida1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCarnet = new javax.swing.JLabel();
        txtCodigoMaterial = new javax.swing.JTextField();
        lblIDMaterial = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        btnDevolucion4 = new javax.swing.JPanel();
        lblDevolucion4 = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(23, 59, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(28, 70, 120));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });

        lblListaEjemplares1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        lblListaEjemplares1.setForeground(new java.awt.Color(255, 255, 255));
        lblListaEjemplares1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_home_15px.png"))); // NOI18N
        lblListaEjemplares1.setText("Home - Usuarios");
        lblListaEjemplares1.setIconTextGap(6);

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblListaEjemplares1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaEjemplares1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 48));

        btnCerrarSesion.setBackground(new java.awt.Color(28, 70, 120));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 48));

        btnPrestamos.setBackground(new java.awt.Color(28, 70, 120));
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrestamosMousePressed(evt);
            }
        });

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

        jPanel1.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 48));

        btnListaEjemplares.setBackground(new java.awt.Color(28, 70, 120));
        btnListaEjemplares.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel1.add(btnListaEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 48));

        btnDevoluciones.setBackground(new java.awt.Color(28, 70, 120));
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDevoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDevolucionesMousePressed(evt);
            }
        });

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

        jPanel1.add(btnDevoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 48));

        btnAgregarEjemplar.setBackground(new java.awt.Color(28, 70, 120));
        btnAgregarEjemplar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel1.add(btnAgregarEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 48));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        labelBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(23, 59, 102));

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

        labelBienvenida1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelBienvenida1.setForeground(new java.awt.Color(23, 59, 102));
        labelBienvenida1.setText("Realizar devolución ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ingrese el ID del material que se desea devolver y el carnet del usuario correspondiente");

        lblCarnet.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCarnet.setForeground(new java.awt.Color(23, 59, 102));
        lblCarnet.setText("Carnet:");

        txtCodigoMaterial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoMaterial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblIDMaterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblIDMaterial.setForeground(new java.awt.Color(23, 59, 102));
        lblIDMaterial.setText("ID del material:");

        txtCarnet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCarnet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnDevolucion4.setBackground(new java.awt.Color(28, 70, 120));
        btnDevolucion4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDevolucion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDevolucion4MouseClicked(evt);
            }
        });

        lblDevolucion4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblDevolucion4.setForeground(new java.awt.Color(255, 255, 255));
        lblDevolucion4.setText("Devolución");
        lblDevolucion4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnDevolucion4Layout = new javax.swing.GroupLayout(btnDevolucion4);
        btnDevolucion4.setLayout(btnDevolucion4Layout);
        btnDevolucion4Layout.setHorizontalGroup(
            btnDevolucion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDevolucion4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDevolucion4)
                .addContainerGap())
        );
        btnDevolucion4Layout.setVerticalGroup(
            btnDevolucion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDevolucion4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelBienvenida1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBienvenida))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblIDMaterial)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(lblCarnet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnDevolucion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBienvenida1)
                    .addComponent(labelBienvenida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDMaterial)
                    .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarnet)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnDevolucion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, -10, 700, 530));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_test_account_110px_2.png"))); // NOI18N
        jPanel1.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 90, -1));

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

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_btnCerrarSesionMousePressed

    private void btnListaEjemplaresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaEjemplaresMousePressed
        // TODO add your handling code here:
        dispose();
        ConsultaEjemplaresAdmin lista = new ConsultaEjemplaresAdmin();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaEjemplaresMousePressed

    private void btnAgregarEjemplarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEjemplarMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarEjemplar agregar = new AgregarEjemplar();
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarEjemplarMousePressed

    private void btnDevolucionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolucionesMousePressed
      
        
    }//GEN-LAST:event_btnDevolucionesMousePressed

    private void btnPrestamosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamosMousePressed
        // TODO add your handling code here:
        dispose();
        PrestamosAdmin prestamos = new PrestamosAdmin();
        prestamos.setVisible(true);
    }//GEN-LAST:event_btnPrestamosMousePressed

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        // TODO add your handling code here:
        dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnHomeMousePressed

    private void btnDevolucion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolucion4MouseClicked
        DevolucionCtrl p = new DevolucionCtrl();
        String materialId = txtCodigoMaterial.getText();
        String carnetId = txtCarnet.getText();
        p.Devolucion(materialId, carnetId);
        limpiarInputs();
    }//GEN-LAST:event_btnDevolucion4MouseClicked
     public void limpiarInputs(){
        txtCodigoMaterial.setText("");
        txtCarnet.setText("");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DevolucionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolucionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolucionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolucionesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevolucionesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarEjemplar;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnDevolucion4;
    private javax.swing.JPanel btnDevoluciones;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnListaEjemplares;
    private javax.swing.JPanel btnPrestamos;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelBienvenida1;
    private javax.swing.JLabel lblAgregarEjemplar;
    private javax.swing.JLabel lblCarnet;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDevolucion4;
    private javax.swing.JLabel lblDevoluciones;
    private javax.swing.JLabel lblIDMaterial;
    private javax.swing.JLabel lblListaEjemplares;
    private javax.swing.JLabel lblListaEjemplares1;
    private javax.swing.JLabel lblPrestamos;
    public static javax.swing.JTextField txtCarnet;
    public static javax.swing.JTextField txtCodigoMaterial;
    // End of variables declaration//GEN-END:variables
}
