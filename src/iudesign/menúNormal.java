/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iudesign;

import Clases.ComprobarConexionInternet;
import Clases.SimpleFactory;
import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author m98am
 */
public class menúNormal extends javax.swing.JFrame {

    /**
     * Creates new form menúGuia
     */
    //Manejo de variables
    private static String fullName,
            /**
             * Creates new form menúGuia
             */
            materia,
            /**
             * Creates new form menúGuia
             */
            seccion;

    public menúNormal(String fullName, String materia, String seccion) {
        initComponents();
        setLocationRelativeTo(null);
        PanelInfo.setVisible(false);

        //Dandole valor a las variables globales
        this.fullName = fullName;
        this.materia = materia;
        this.seccion = seccion;

        //Haciendo que los labels tengan los valores que deben
        menúNormal.JlabelFullName.setText(fullName);
        menúNormal.jLabelmateria.setText(materia);
        menúNormal.jlabelSeccion.setText(seccion);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlabelSeccion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIngresarNotas = new javax.swing.JButton();
        btnModificarNotas = new javax.swing.JButton();
        PanelInfo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        brnCerrarSesion = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JlabelFullName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelmateria = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        BtnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Complejo Educativo Confederación Suiza");

        jlabelSeccion.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(352, 352, 352))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jlabelSeccion))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1000, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Modificar notas");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Ingresar notas");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Laptop_96px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, 110));

        btnIngresarNotas.setBackground(new java.awt.Color(69, 113, 143));
        btnIngresarNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Webp.net-gifmaker.gif"))); // NOI18N
        btnIngresarNotas.setBorder(null);
        btnIngresarNotas.setBorderPainted(false);
        btnIngresarNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarNotasMouseExited(evt);
            }
        });
        btnIngresarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNotasActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 240, 140));

        btnModificarNotas.setBackground(new java.awt.Color(3, 57, 57));
        btnModificarNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/e8e35fafa9e5282b5de8478e7febaf0d2dd79123_hq.gif"))); // NOI18N
        btnModificarNotas.setBorder(null);
        btnModificarNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarNotasMouseExited(evt);
            }
        });
        btnModificarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarNotasActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 240, 130));

        PanelInfo.setBackground(new java.awt.Color(0, 0, 0));
        PanelInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        PanelInfo.setForeground(new java.awt.Color(0, 0, 51));
        PanelInfo.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Attention_32px.png"))); // NOI18N

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(PanelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 490, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Male_User_100px.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, -1));

        brnCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        brnCerrarSesion.setText("Cerrar sesión");
        brnCerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        brnCerrarSesion.setContentAreaFilled(false);
        brnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(brnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 454, 126, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Desde aquí puedes:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ingresar y modificar notas. ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        JlabelFullName.setBackground(new java.awt.Color(255, 255, 255));
        JlabelFullName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JlabelFullName.setForeground(new java.awt.Color(255, 255, 255));
        JlabelFullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelFullName.setText("          Usuario");
        getContentPane().add(JlabelFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 255, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 255, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 260, 10));

        jLabelmateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelmateria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelmateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelmateria.setText("Nombre del curso");
        getContentPane().add(jLabelmateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 238, -1));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 20, 560));

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Close_Window_32px.png"))); // NOI18N
        BtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Horizontal_Line_32px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 21, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestión Académica");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 38));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 255, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG_0849[1152].JPG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarNotasMouseEntered
        PanelInfo.setVisible(true);
        jLabel13.setText("                         Ingresa las calificaciones del periodo correspondiente");
    }//GEN-LAST:event_btnIngresarNotasMouseEntered

    private void btnIngresarNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarNotasMouseExited
        PanelInfo.setVisible(false);
        jLabel13.setText("");
    }//GEN-LAST:event_btnIngresarNotasMouseExited

    private void btnModificarNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarNotasMouseEntered
        PanelInfo.setVisible(true);
        jLabel13.setText("                                       Modifica las notas de tus alumnos");
    }//GEN-LAST:event_btnModificarNotasMouseEntered

    private void btnModificarNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarNotasMouseExited
        PanelInfo.setVisible(false);
        jLabel13.setText("");
    }//GEN-LAST:event_btnModificarNotasMouseExited

    private void brnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCerrarSesionActionPerformed
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.constructorObjetos(2); //Login
        simpleFactory = null;
        this.dispose();
    }//GEN-LAST:event_brnCerrarSesionActionPerformed

    private void BtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnIngresarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNotasActionPerformed
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.constructorObjetosVariables(4, fullName, materia, seccion);
        simpleFactory = null;
        this.dispose();
    }//GEN-LAST:event_btnIngresarNotasActionPerformed

    private void btnModificarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarNotasActionPerformed
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.constructorObjetosVariables(5, fullName, materia, seccion); 
        simpleFactory = null;
        this.dispose();
    }//GEN-LAST:event_btnModificarNotasActionPerformed

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
            java.util.logging.Logger.getLogger(menúNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menúNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menúNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menúNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menúNormal(fullName, materia, seccion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCerrar;
    public static javax.swing.JLabel JlabelFullName;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JButton brnCerrarSesion;
    private javax.swing.JButton btnIngresarNotas;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnModificarNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabelmateria;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JLabel jlabelSeccion;
    // End of variables declaration//GEN-END:variables
}
