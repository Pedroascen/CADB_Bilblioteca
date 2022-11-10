/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Jazmine
 */
public class ConsultaEjemplaresUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaEjemplaresUsuarios
     */
    public ConsultaEjemplaresUsuarios() {
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
        lblTItulo = new javax.swing.JPanel();
        lblListaRegistrados = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JPanel();
        lblConsultar = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        rbtnTitulo = new javax.swing.JRadioButton();
        rbtnAutor = new javax.swing.JRadioButton();
        rbtnClasificacion = new javax.swing.JRadioButton();
        cboMaterial = new javax.swing.JComboBox<>();
        cboIdioma = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        iconUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 59, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(28, 70, 120));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });

        lblListaEjemplares1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        lblListaEjemplares1.setForeground(new java.awt.Color(255, 255, 255));
        lblListaEjemplares1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_home_15px.png"))); // NOI18N
        lblListaEjemplares1.setText("Home ");
        lblListaEjemplares1.setIconTextGap(6);

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblListaEjemplares1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaEjemplares1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 48));

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
                .addContainerGap(51, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 190, 48));

        lblTItulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTItulo.setForeground(new java.awt.Color(23, 59, 102));

        lblListaRegistrados.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblListaRegistrados.setForeground(new java.awt.Color(23, 59, 102));
        lblListaRegistrados.setText("Consulta de ejemplares registrados");

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

        btnConsultar.setBackground(new java.awt.Color(28, 70, 120));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConsultarMousePressed(evt);
            }
        });

        lblConsultar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblConsultar.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultar.setText("Consultar");
        lblConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnConsultarLayout = new javax.swing.GroupLayout(btnConsultar);
        btnConsultar.setLayout(btnConsultarLayout);
        btnConsultarLayout.setHorizontalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnConsultarLayout.setVerticalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        lbltitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(23, 59, 102));
        lbltitulo.setText("Título:");

        lblAutor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(23, 59, 102));
        lblAutor.setText("Autor(es):");

        lblMaterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblMaterial.setForeground(new java.awt.Color(23, 59, 102));
        lblMaterial.setText("Material:");

        lblIdioma.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(23, 59, 102));
        lblIdioma.setText("Idioma:");

        lblFiltro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblFiltro.setForeground(new java.awt.Color(23, 59, 102));
        lblFiltro.setText("Ordenar resultados por:");

        rbtnTitulo.setBackground(new java.awt.Color(255, 255, 255));
        rbtnTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbtnTitulo.setText("Título");
        rbtnTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTituloActionPerformed(evt);
            }
        });

        rbtnAutor.setBackground(new java.awt.Color(255, 255, 255));
        rbtnAutor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbtnAutor.setText("Autor");

        rbtnClasificacion.setBackground(new java.awt.Color(255, 255, 255));
        rbtnClasificacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbtnClasificacion.setText("Clasificación");

        cboMaterial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Obra", "Revista", "Tesis", "CD" }));
        cboMaterial.setSelectedIndex(-1);
        cboMaterial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cboIdioma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        cboIdioma.setSelectedIndex(-1);
        cboIdioma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout lblTItuloLayout = new javax.swing.GroupLayout(lblTItulo);
        lblTItulo.setLayout(lblTItuloLayout);
        lblTItuloLayout.setHorizontalGroup(
            lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTItuloLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaRegistrados))
                .addGap(98, 98, 98))
            .addGroup(lblTItuloLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblTItuloLayout.createSequentialGroup()
                            .addComponent(lblAutor)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblTItuloLayout.createSequentialGroup()
                            .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIdioma)
                                .addComponent(lblMaterial)
                                .addComponent(lbltitulo))
                            .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTItuloLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(72, 72, 72))
                                .addGroup(lblTItuloLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(lblTItuloLayout.createSequentialGroup()
                        .addComponent(lblFiltro)
                        .addGap(18, 18, 18)
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(rbtnTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnAutor)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnClasificacion))
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblTItuloLayout.setVerticalGroup(
            lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTItuloLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(lblListaRegistrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitulo)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterial)
                    .addComponent(cboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdioma)
                    .addComponent(cboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltro)
                    .addComponent(rbtnTitulo)
                    .addComponent(rbtnAutor)
                    .addComponent(rbtnClasificacion))
                .addGap(33, 33, 33)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanel1.add(lblTItulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, -10, 770, 530));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/logo white150px.png"))); // NOI18N
        jPanel1.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    private void btnConsultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarMousePressed

    private void rbtnTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTituloActionPerformed

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        // TODO add your handling code here:
        dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnHomeMousePressed

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
            java.util.logging.Logger.getLogger(ConsultaEjemplaresUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEjemplaresUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEjemplaresUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEjemplaresUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEjemplaresUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnConsultar;
    private javax.swing.JPanel btnHome;
    private javax.swing.JComboBox<String> cboIdioma;
    private javax.swing.JComboBox<String> cboMaterial;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblListaEjemplares1;
    private javax.swing.JLabel lblListaRegistrados;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JPanel lblTItulo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JRadioButton rbtnAutor;
    private javax.swing.JRadioButton rbtnClasificacion;
    private javax.swing.JRadioButton rbtnTitulo;
    // End of variables declaration//GEN-END:variables
}