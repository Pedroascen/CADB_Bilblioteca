/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.UsuarioDataLogin;

/**
 *
 * @author Jazmine
 */
public class AgregarEjemplar extends javax.swing.JFrame {

    //instacias de objetos
    
    public AgregarEjemplar() {
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
        btnListaEjemplares = new javax.swing.JPanel();
        lblListaEjemplares1 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        lblCerrarSesion = new javax.swing.JLabel();
        btnPrestamos = new javax.swing.JPanel();
        lblPrestamos = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        lblListaEjemplares = new javax.swing.JLabel();
        btnDevoluciones = new javax.swing.JPanel();
        lblDevoluciones = new javax.swing.JLabel();
        btnAgregarEjemplar = new javax.swing.JPanel();
        lblAgregarEjemplar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblEjemplarnuevo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnLibro = new javax.swing.JPanel();
        lblAdministrarUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnObra = new javax.swing.JPanel();
        lblObra = new javax.swing.JLabel();
        btnTesis = new javax.swing.JPanel();
        lblTesis = new javax.swing.JLabel();
        btnRevista = new javax.swing.JPanel();
        lblRevista = new javax.swing.JLabel();
        btnCD = new javax.swing.JPanel();
        lblCD = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(23, 59, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListaEjemplares.setBackground(new java.awt.Color(28, 70, 120));
        btnListaEjemplares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaEjemplares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListaEjemplaresMousePressed(evt);
            }
        });

        lblListaEjemplares1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        lblListaEjemplares1.setForeground(new java.awt.Color(255, 255, 255));
        lblListaEjemplares1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_menu_15px.png"))); // NOI18N
        lblListaEjemplares1.setText("Consulta de ejemplares");
        lblListaEjemplares1.setIconTextGap(6);

        javax.swing.GroupLayout btnListaEjemplaresLayout = new javax.swing.GroupLayout(btnListaEjemplares);
        btnListaEjemplares.setLayout(btnListaEjemplaresLayout);
        btnListaEjemplaresLayout.setHorizontalGroup(
            btnListaEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListaEjemplaresLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblListaEjemplares1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btnListaEjemplaresLayout.setVerticalGroup(
            btnListaEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnListaEjemplaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaEjemplares1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnListaEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 48));

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

        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 48));

        btnPrestamos.setBackground(new java.awt.Color(28, 70, 120));
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btnHome.setBackground(new java.awt.Color(28, 70, 120));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });

        lblListaEjemplares.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        lblListaEjemplares.setForeground(new java.awt.Color(255, 255, 255));
        lblListaEjemplares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_home_15px.png"))); // NOI18N
        lblListaEjemplares.setText("Home - Usuarios");
        lblListaEjemplares.setIconTextGap(6);

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblListaEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 48));

        btnDevoluciones.setBackground(new java.awt.Color(28, 70, 120));
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel1.add(btnAgregarEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 48));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblEjemplarnuevo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblEjemplarnuevo.setForeground(new java.awt.Color(23, 59, 102));
        lblEjemplarnuevo.setText("Agregar ejemplar nuevo");

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

        btnLibro.setBackground(new java.awt.Color(28, 70, 120));
        btnLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibro.setDoubleBuffered(false);
        btnLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLibroMousePressed(evt);
            }
        });

        lblAdministrarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblAdministrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrarUsuario.setText("Libro");
        lblAdministrarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnLibroLayout = new javax.swing.GroupLayout(btnLibro);
        btnLibro.setLayout(btnLibroLayout);
        btnLibroLayout.setHorizontalGroup(
            btnLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLibroLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblAdministrarUsuario)
                .addGap(25, 25, 25))
        );
        btnLibroLayout.setVerticalGroup(
            btnLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdministrarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Seleccione el tipo de ejemplar que desea agregar a la lista");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_book_80px.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_literature_80px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_teaching_80px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_cd_80px.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_magazine_80px.png"))); // NOI18N

        btnObra.setBackground(new java.awt.Color(28, 70, 120));
        btnObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnObra.setDoubleBuffered(false);
        btnObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnObraMousePressed(evt);
            }
        });

        lblObra.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblObra.setForeground(new java.awt.Color(255, 255, 255));
        lblObra.setText("Obra literaria");
        lblObra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblObraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnObraLayout = new javax.swing.GroupLayout(btnObra);
        btnObra.setLayout(btnObraLayout);
        btnObraLayout.setHorizontalGroup(
            btnObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnObraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblObra, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        btnObraLayout.setVerticalGroup(
            btnObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblObra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        btnTesis.setBackground(new java.awt.Color(28, 70, 120));
        btnTesis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTesis.setDoubleBuffered(false);
        btnTesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTesisMousePressed(evt);
            }
        });

        lblTesis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblTesis.setForeground(new java.awt.Color(255, 255, 255));
        lblTesis.setText("Tesis");
        lblTesis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTesisMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnTesisLayout = new javax.swing.GroupLayout(btnTesis);
        btnTesis.setLayout(btnTesisLayout);
        btnTesisLayout.setHorizontalGroup(
            btnTesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTesisLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(lblTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnTesisLayout.setVerticalGroup(
            btnTesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTesis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        btnRevista.setBackground(new java.awt.Color(28, 70, 120));
        btnRevista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRevista.setDoubleBuffered(false);
        btnRevista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRevistaMousePressed(evt);
            }
        });

        lblRevista.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblRevista.setForeground(new java.awt.Color(255, 255, 255));
        lblRevista.setText("Revista");
        lblRevista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblRevista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRevistaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnRevistaLayout = new javax.swing.GroupLayout(btnRevista);
        btnRevista.setLayout(btnRevistaLayout);
        btnRevistaLayout.setHorizontalGroup(
            btnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRevistaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRevistaLayout.setVerticalGroup(
            btnRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRevista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        btnCD.setBackground(new java.awt.Color(28, 70, 120));
        btnCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCD.setDoubleBuffered(false);
        btnCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCDMousePressed(evt);
            }
        });

        lblCD.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblCD.setForeground(new java.awt.Color(255, 255, 255));
        lblCD.setText("CD");
        lblCD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnCDLayout = new javax.swing.GroupLayout(btnCD);
        btnCD.setLayout(btnCDLayout);
        btnCDLayout.setHorizontalGroup(
            btnCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCDLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnCDLayout.setVerticalGroup(
            btnCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEjemplarnuevo)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(btnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnObra, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(btnTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnRevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblEjemplarnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, -10, 700, 530));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/icons8_test_account_110px_2.png"))); // NOI18N
        jPanel1.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Administrador");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 90, -1));

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

    private void btnLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibroMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarLibro addLibro = new AgregarLibro();
        addLibro.setVisible(true);
    }//GEN-LAST:event_btnLibroMousePressed

    private void btnObraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObraMousePressed

    private void btnTesisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTesisMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTesisMousePressed

    private void btnRevistaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevistaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRevistaMousePressed

    private void btnCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCDMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarCD cd = new AgregarCD();
        cd.setVisible(true);
    }//GEN-LAST:event_btnCDMousePressed

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        // TODO add your handling code here:
        dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnHomeMousePressed

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

    private void lblObraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblObraMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarObra obra = new AgregarObra();
        obra.setVisible(true);
    }//GEN-LAST:event_lblObraMousePressed

    private void lblTesisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTesisMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarTesis tesis = new AgregarTesis();
        tesis.setVisible(true);
    }//GEN-LAST:event_lblTesisMousePressed

    private void lblRevistaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRevistaMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarRevista revista = new AgregarRevista();
        revista.setVisible(true);
    }//GEN-LAST:event_lblRevistaMousePressed

    private void btnPrestamosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamosMousePressed
        // TODO add your handling code here:
        dispose();
        PrestamosAdmin prestamos = new PrestamosAdmin();
        prestamos.setVisible(true);
    }//GEN-LAST:event_btnPrestamosMousePressed

    private void btnDevolucionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolucionesMousePressed
        // TODO add your handling code here:
        dispose();
        DevolucionesAdmin dev = new DevolucionesAdmin();
        dev.setVisible(true);       
    }//GEN-LAST:event_btnDevolucionesMousePressed

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
            java.util.logging.Logger.getLogger(AgregarEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEjemplar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarEjemplar;
    private javax.swing.JPanel btnCD;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnDevoluciones;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnLibro;
    private javax.swing.JPanel btnListaEjemplares;
    private javax.swing.JPanel btnObra;
    private javax.swing.JPanel btnPrestamos;
    private javax.swing.JPanel btnRevista;
    private javax.swing.JPanel btnTesis;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAdministrarUsuario;
    private javax.swing.JLabel lblAgregarEjemplar;
    private javax.swing.JLabel lblCD;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDevoluciones;
    private javax.swing.JLabel lblEjemplarnuevo;
    private javax.swing.JLabel lblListaEjemplares;
    private javax.swing.JLabel lblListaEjemplares1;
    private javax.swing.JLabel lblObra;
    private javax.swing.JLabel lblPrestamos;
    private javax.swing.JLabel lblRevista;
    private javax.swing.JLabel lblTesis;
    // End of variables declaration//GEN-END:variables
}
