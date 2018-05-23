/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author iker
 */
public class interfazVerPerfil extends javax.swing.JFrame {

    /**
     * Creates new form interfazVerPerfil
     */
    public interfazVerPerfil() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar2 = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        ofertas = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        chat = new javax.swing.JButton();
        of1 = new javax.swing.JButton();
        of2 = new javax.swing.JButton();
        of3 = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        perfil = new javax.swing.JButton();
        principal = new javax.swing.JButton();
        empresa = new javax.swing.JLabel();
        menu1 = new javax.swing.JLabel();
        menu2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(350, 480));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscar.png"))); // NOI18N
        buscar2.setContentAreaFilled(false);
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -1, 70, 50));

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/add.png"))); // NOI18N
        crear.setContentAreaFilled(false);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        ofertas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ofertas.setText("OFERTAS");
        getContentPane().add(ofertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/photo2.png"))); // NOI18N
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("NOMBRE OFERTANTE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        ciudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ciudad.setText("CIUDAD");
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        valor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/review.png"))); // NOI18N
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/chat.png"))); // NOI18N
        chat.setContentAreaFilled(false);
        chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatActionPerformed(evt);
            }
        });
        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        of1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        of1.setForeground(new java.awt.Color(51, 102, 255));
        of1.setText("NOMBRE OFERTA 1");
        of1.setContentAreaFilled(false);
        of1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                of1ActionPerformed(evt);
            }
        });
        getContentPane().add(of1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        of2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        of2.setForeground(new java.awt.Color(51, 102, 255));
        of2.setText("NOMBRE OFERTA 2");
        of2.setContentAreaFilled(false);
        of2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                of2ActionPerformed(evt);
            }
        });
        getContentPane().add(of2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        of3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        of3.setForeground(new java.awt.Color(51, 102, 255));
        of3.setText("NOMBRE OFERTA 3");
        of3.setContentAreaFilled(false);
        of3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                of3ActionPerformed(evt);
            }
        });
        getContentPane().add(of3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/arrow.png"))); // NOI18N
        volver.setContentAreaFilled(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 30));

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/no_profile.png"))); // NOI18N
        perfil.setContentAreaFilled(false);
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        getContentPane().add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tie.png"))); // NOI18N
        principal.setContentAreaFilled(false);
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }
        });
        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        empresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo1.png"))); // NOI18N
        getContentPane().add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu2.setText("jLabel2");
        getContentPane().add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        interfazPrincipal a = new interfazPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_principalActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        interfazPerfil a = new interfazPerfil();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        interfazEditarOferta c = new interfazEditarOferta();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
        interfazAux d = new interfazAux();
        d.setVisible(true);
    }//GEN-LAST:event_chatActionPerformed

    private void of1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_of1ActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_of1ActionPerformed

    private void of2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_of2ActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_of2ActionPerformed

    private void of3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_of3ActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_of3ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazVerPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazVerPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazVerPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazVerPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazVerPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar2;
    private javax.swing.JButton chat;
    private javax.swing.JLabel ciudad;
    private javax.swing.JButton crear;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel foto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel menu2;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton of1;
    private javax.swing.JButton of2;
    private javax.swing.JButton of3;
    private javax.swing.JLabel ofertas;
    private javax.swing.JButton perfil;
    private javax.swing.JButton principal;
    private javax.swing.JLabel valor;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
