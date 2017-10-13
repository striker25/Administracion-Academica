/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iudesign;

import Clases.ComprobarConexionInternet;
import Clases.SimpleFactory;
import static com.sun.javafx.tk.Toolkit.getToolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author m98am
 */
public class registrarse extends javax.swing.JFrame {

    /**
     * Creates new form registrarse
     */
    private static String nombre, apellido, correo, contraseña, fullName;

    public registrarse() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtCorreoConfirm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPasswordConfirm = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spinner.gif"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Registro");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Nombre ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Apellidos ");

        jSeparator1.setForeground(new java.awt.Color(240, 240, 240));

        jSeparator2.setForeground(new java.awt.Color(240, 240, 240));

        btnRegistrar.setBackground(new java.awt.Color(183, 73, 0));
        btnRegistrar.setForeground(new java.awt.Color(240, 240, 240));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setDefaultCapable(false);
        btnRegistrar.setDoubleBuffered(true);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Go Back_32px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Horizontal_Line_32px.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(0, 0, 51));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(240, 240, 240));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Correo electrónico ");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Contraseña");

        jSeparator3.setForeground(new java.awt.Color(240, 240, 240));

        jSeparator4.setForeground(new java.awt.Color(240, 240, 240));

        txtCorreo.setBackground(new java.awt.Color(0, 0, 51));
        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(240, 240, 240));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 0, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(240, 240, 240));
        jTextField4.setText("  ");
        jTextField4.setBorder(null);

        txtApellido.setBackground(new java.awt.Color(0, 0, 51));
        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(240, 240, 240));
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(0, 0, 51));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(240, 240, 240));
        txtPassword.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Confirmar correo electrónico ");

        jSeparator5.setForeground(new java.awt.Color(240, 240, 240));

        txtCorreoConfirm.setBackground(new java.awt.Color(0, 0, 51));
        txtCorreoConfirm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtCorreoConfirm.setForeground(new java.awt.Color(240, 240, 240));
        txtCorreoConfirm.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Confirmar contraseña");

        txtPasswordConfirm.setBackground(new java.awt.Color(0, 0, 51));
        txtPasswordConfirm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtPasswordConfirm.setForeground(new java.awt.Color(240, 240, 240));
        txtPasswordConfirm.setBorder(null);

        jSeparator6.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jSeparator1)
                                .addComponent(jLabel4)
                                .addComponent(txtNombre)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator4)
                                .addComponent(jLabel7)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(286, 286, 286)
                                    .addComponent(jTextField4))
                                .addComponent(txtPassword)
                                .addComponent(jLabel8)
                                .addComponent(jSeparator5)
                                .addComponent(txtCorreoConfirm)
                                .addComponent(jLabel9)
                                .addComponent(txtPasswordConfirm)
                                .addComponent(jSeparator6))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel17))
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        /*

        //SI LA CONEXION A INTERNET ESTA BIEN, ENTONCES SE PREOCEDE A GUARDAR EL NUEVO MAESTRO.
        ComprobarConexionInternet i = new ComprobarConexionInternet();
        if (i.comprobarConexion()) {
            String numeros = "0123456789@*!$#%&/()=?¡'¿'*+¨´{}[]-.,;:,.-^^``~~~¬¬123";
            if (!(txtNombre.getText().isEmpty()) && !(txtApellido.getText().isEmpty())
                    && !(txtPassword.getText().isEmpty()) && !(txtCorreo.getText().isEmpty()) 
                    && !(txtCorreoConfirm.getText().isEmpty()) && !(txtPasswordConfirm.getText().isEmpty()) ) {

                if (txtCorreo.getText().contains("@")) {
                    if (!(txtNombre.getText().contains(numeros))) { //SE VERIFICA QUE EL NOMBRE CONTENGA SÓLO LETRAS
                        if (!(txtApellido.getText().contains(numeros))) {//SE VERIFICA QUE EL APELLIDO CONTENGA SOLO LETRAS
                            nombre = (txtNombre.getText());
                            apellido = (txtApellido.getText());
                            correo = (txtCorreo.getText());
                            contraseña = (txtPassword.getText());
                            fullName = nombre + " " + apellido;
                            new menú(fullName, correo).setVisible(true);

                            //Cerrar REGISTRAR
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Verifique que sus apellidos esten bien escritos.", "Información", 0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Verifique que su nombres esten bien escritos.", "Información", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Verifique que sea una dirección de correo electronico válida.", "Información", 0);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Todos los campos están vacíos.\n\nPor favor, complete el formulario.", "Información", 0);
            }
            
            
         */
        //COMPROBACIÓN INDIVIDUAL DE CADA CAMPO

        //SI LA CONEXION A INTERNET ESTA BIEN, ENTONCES SE PREOCEDE A GUARDAR EL NUEVO MAESTRO.
        ComprobarConexionInternet i = new ComprobarConexionInternet();
        if (i.comprobarConexion()) {
            boolean nombrebol, apellidobol, correobol, correoConfirm, contra, contraConfirm;
            nombrebol = apellidobol = correobol = correoConfirm = contra = contraConfirm = false;
            String campos = "";

            //EN PRIMERA INSTANCIA, SE COMPRUEBA SI TODOS LOS CAMPOS ESTAN VACIOS
            if (!(txtNombre.getText().isEmpty()) && !(txtApellido.getText().isEmpty())
                    && !(txtPassword.getText().isEmpty()) && !(txtCorreo.getText().isEmpty())
                    && !(txtCorreoConfirm.getText().isEmpty()) && !(txtPasswordConfirm.getText().isEmpty())) {
                //SI NO ESTAN VACIOS, LAS VARIABLES SE ENVIAN
                nombre = (txtNombre.getText());
                apellido = (txtApellido.getText());
                correo = (txtCorreo.getText());
                contraseña = (txtPassword.getText());
                fullName = nombre + " " + apellido;
                new menú(fullName, correo).setVisible(true);

                //Cerrar REGISTRAR
                this.dispose();
            } else {

                //AQUI SE COMPRUEBA si cada campo tiene algun valor
                if ((txtNombre.getText()).length() == 0) {
                    nombrebol = true;
                }
                if ((txtApellido.getText()).length() == 0) {
                    apellidobol = true;
                }

                if ((txtCorreo.getText()).length() == 0) {
                    correobol = true;
                }

                if ((txtCorreoConfirm.getText()).length() == 0) {
                    correoConfirm = true;
                }

                if ((txtPassword.getText()).length() == 0) {
                    contra = true;
                }

                if ((txtPasswordConfirm.getText()).length() == 0) {
                    contraConfirm = true;
                }

                //MOSTRAR UN MENSAJE SOBRE QUE CAMPOS FALTAN
                if (nombrebol == true || apellidobol == true || correobol == true
                        || correoConfirm == true || contra == true || contraConfirm == true) {
                    //Logic
                    String nombrecad = "", apellidocad = "", correocad = "",
                            correoConfirmcad = "", contracad = "", contraConfirmcad = "";
                    if (nombrebol) {
                        nombrecad += "Nombre\n";
                    }
                    if (apellidobol) {
                        apellidocad += "Apellido\n";
                    }
                    if (correobol) {
                        correocad += "Correo\n";
                    }
                    if (correoConfirm) {
                        correoConfirmcad += "Confirmar correo\n";
                    }
                    if (contra) {
                        contracad += "Contraseña\n";
                    }
                    if (contraConfirm) {
                        contraConfirmcad += "Confirmar contraseña\n";
                    }

                    campos += nombrecad + "\n" + apellidocad + "\n" + correocad + "\n" + correoConfirmcad + "\n" + contracad + "\n" + contraConfirmcad;
                    JOptionPane.showMessageDialog(this, "Los siguientes campos están vacíos.\n" + campos + "\nPor favor, complete el formulario.", "Información", 0);
                }
            }

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.constructorObjetos(2); //Login
        simpleFactory = null;
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel17MouseClicked
    int xy, xx;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //VALIDANDO QUE EL USUARIO INGRESE SÓLO LETRAS
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char C = evt.getKeyChar();
        if (Character.isDigit(C) || ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 129
                || (int) evt.getKeyChar() >= 131 && (int) evt.getKeyChar() <= 159
                || (int) evt.getKeyChar() >= 166 && (int) evt.getKeyChar() <= 255)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras.", "Dato erróneo", 0);
            txtNombre.setCursor(null);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char C = evt.getKeyChar();
        if (Character.isDigit(C) || ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 129
                || (int) evt.getKeyChar() >= 131 && (int) evt.getKeyChar() <= 159
                || (int) evt.getKeyChar() >= 166 && (int) evt.getKeyChar() <= 255)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras.", "Dato erróneo", 0);
            txtApellido.setCursor(null);
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarse.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoConfirm;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
