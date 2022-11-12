/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
import Controlador.RevistaCtrl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Jazmine
 */
public class AgregarRevista extends javax.swing.JFrame {
    
    //Instancia para acceder a los métodos
    RevistaCtrl revistactrl = new RevistaCtrl();
    
    /**
     * Creates new form AgregarRevista
     */
    public AgregarRevista() {
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
        lblTItulo = new javax.swing.JPanel();
        lblListaRegistrados = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblPeriodicidad = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblISSN = new javax.swing.JLabel();
        lblFechaPub = new javax.swing.JLabel();
        lblTamanio = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        txtISSN = new javax.swing.JTextField();
        txtFechaPub = new javax.swing.JTextField();
        txtTamanio = new javax.swing.JTextField();
        txtPeriodicidad = new javax.swing.JTextField();
        lblIdioma = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblCantEjemplares = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCantEjemplares = new javax.swing.JTextField();
        iconUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
                .addComponent(lblListaEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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

        lblTItulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTItulo.setForeground(new java.awt.Color(23, 59, 102));

        lblListaRegistrados.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblListaRegistrados.setForeground(new java.awt.Color(23, 59, 102));
        lblListaRegistrados.setText("Agregar una nueva revista");

        jPanel6.setBackground(new java.awt.Color(28, 70, 120));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        btnAgregar.setBackground(new java.awt.Color(28, 70, 120));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        lblAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setText("Agregar");
        lblAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgregar)
                .addContainerGap())
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        lbltitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(23, 59, 102));
        lbltitulo.setText("Título:");

        lblEditorial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblEditorial.setForeground(new java.awt.Color(23, 59, 102));
        lblEditorial.setText("Editorial:");

        lblPeriodicidad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblPeriodicidad.setForeground(new java.awt.Color(23, 59, 102));
        lblPeriodicidad.setText("Periodicidad:");

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        lblISSN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblISSN.setForeground(new java.awt.Color(23, 59, 102));
        lblISSN.setText("ISSN:");

        lblFechaPub.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblFechaPub.setForeground(new java.awt.Color(23, 59, 102));
        lblFechaPub.setText("Fecha de publicación:");

        lblTamanio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblTamanio.setForeground(new java.awt.Color(23, 59, 102));
        lblTamanio.setText("Tamaño:");

        txtEditorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtISSN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtISSN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtISSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISSNKeyTyped(evt);
            }
        });

        txtFechaPub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFechaPub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtTamanio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTamanio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtPeriodicidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeriodicidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblIdioma.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(23, 59, 102));
        lblIdioma.setText("Idioma:");

        lblUbicacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblUbicacion.setForeground(new java.awt.Color(23, 59, 102));
        lblUbicacion.setText("Ubicación física:");

        lblCantEjemplares.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCantEjemplares.setForeground(new java.awt.Color(23, 59, 102));
        lblCantEjemplares.setText("Cantidad de ejemplares:");

        txtIdioma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdioma.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        txtUbicacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUbicacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        txtCantEjemplares.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCantEjemplares.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout lblTItuloLayout = new javax.swing.GroupLayout(lblTItulo);
        lblTItulo.setLayout(lblTItuloLayout);
        lblTItuloLayout.setHorizontalGroup(
            lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTItuloLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaRegistrados))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTItuloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTItuloLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblTItuloLayout.createSequentialGroup()
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblEditorial)
                                .addGap(18, 18, 18)
                                .addComponent(txtEditorial))
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lbltitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblISSN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtISSN, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblTamanio)
                                .addGap(18, 18, 18)
                                .addComponent(txtTamanio))
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblFechaPub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaPub, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblPeriodicidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPeriodicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblCantEjemplares)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantEjemplares))
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblIdioma)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdioma))
                            .addGroup(lblTItuloLayout.createSequentialGroup()
                                .addComponent(lblUbicacion)
                                .addGap(18, 18, 18)
                                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(76, 76, 76))
        );
        lblTItuloLayout.setVerticalGroup(
            lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTItuloLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(lblListaRegistrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdioma)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTItuloLayout.createSequentialGroup()
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditorial)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtISSN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblISSN)))
                    .addGroup(lblTItuloLayout.createSequentialGroup()
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUbicacion)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantEjemplares, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCantEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeriodicidad)
                            .addComponent(txtPeriodicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaPub)
                            .addComponent(txtFechaPub, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(lblTItuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTamanio))
                .addGap(33, 33, 33)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanel1.add(lblTItulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, -10, 880, 530));

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

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        // TODO add your handling code here:
        dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnHomeMousePressed

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

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        // TODO add your handling code here:
        String codMaterial = "";
        String titulo = txtTitulo.getText();
        String ufisica = txtUbicacion.getText();
        String cejemp = txtCantEjemplares.getText();
        String editorial = txtEditorial.getText();
        String issn = txtISSN.getText();
        String idioma = txtIdioma.getText();
        String tamano = txtTamanio.getText();
        String periodicidad = txtPeriodicidad.getText();
        String fechapublicacion = txtFechaPub.getText();
        
        //JOptionPane.showMessageDialog(null, "Los datos son: ");
        if (txtISSN.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "El ISSN no puede ser mayor a 10 caracteres.");
            txtISSN.setText("");
            issn = "";
        }
        if(ValidarFecha(fechapublicacion)==false){
            JOptionPane.showMessageDialog(null, "Ingrese formato (yyyy-mm-dd) para fecha publicacion: ");
            txtFechaPub.setText("");
            fechapublicacion="";
        }
        
        if (!titulo.equals("") && !ufisica.equals("") && !cejemp.equals("") && !editorial.equals("") && !issn.equals("") && !idioma.equals("") && !tamano.equals("") && !periodicidad.equals("") && !fechapublicacion.equals("")) {
            revistactrl.guardar_update(codMaterial, titulo, ufisica, cejemp, editorial, issn, idioma, tamano, periodicidad, fechapublicacion);
            limpiarInputs();
        } else {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios.");
        }
       
    }//GEN-LAST:event_btnAgregarMousePressed

      public void limpiarInputs(){
        txtTitulo.setText("");
        txtUbicacion.setText("");
        txtCantEjemplares.setText("");
        txtEditorial.setText("");
        txtISSN.setText("");
        txtIdioma.setText("");
        txtTamanio.setText("");
        txtPeriodicidad.setText("");
        txtFechaPub.setText("");
    }
    private boolean ValidarFecha(String fechaPublic){
        try {
            LocalDate fecha = LocalDate.parse(fechaPublic, DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println("Fecha correcta!!");
            System.out.println("Dia: " + fecha.getDayOfMonth());
            System.out.println("Mes: " + fecha.getMonthValue());
            System.out.println("Año: " + fecha.getYear());
            return true;
        } catch (DateTimeParseException ex) {
            System.out.println("ERROR. No se pudo crear FECHA con esa entrada.");
            return false;
        }
    }
    private void btnAgregarEjemplarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEjemplarMousePressed
        // TODO add your handling code here:
        dispose();
        AgregarEjemplar agregar = new AgregarEjemplar();
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarEjemplarMousePressed

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

    private void txtISSNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISSNKeyTyped
        //Validación para admitir solamente números
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtISSNKeyTyped

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
            java.util.logging.Logger.getLogger(AgregarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarRevista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnAgregarEjemplar;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnDevoluciones;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnListaEjemplares;
    private javax.swing.JPanel btnPrestamos;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblAgregarEjemplar;
    private javax.swing.JLabel lblCantEjemplares;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDevoluciones;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblFechaPub;
    private javax.swing.JLabel lblISSN;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblListaEjemplares;
    private javax.swing.JLabel lblListaEjemplares1;
    private javax.swing.JLabel lblListaRegistrados;
    private javax.swing.JLabel lblPeriodicidad;
    private javax.swing.JLabel lblPrestamos;
    private javax.swing.JPanel lblTItulo;
    private javax.swing.JLabel lblTamanio;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lbltitulo;
    public static javax.swing.JTextField txtCantEjemplares;
    public static javax.swing.JTextField txtEditorial;
    public static javax.swing.JTextField txtFechaPub;
    public static javax.swing.JTextField txtISSN;
    public static javax.swing.JTextField txtIdioma;
    public static javax.swing.JTextField txtPeriodicidad;
    public static javax.swing.JTextField txtTamanio;
    public static javax.swing.JTextField txtTitulo;
    public static javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
