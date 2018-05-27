/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author iker
 */
public class interfazEditarPerfil extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controlador ctrl;
	/**
     * Creates new form interfazEditarPerfil
     */
    public interfazEditarPerfil(Controlador ctrl) {
    	this.ctrl = ctrl;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear = new javax.swing.JButton();
        foto2 = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        principal = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nombre2 = new javax.swing.JButton();
        ciudad2 = new javax.swing.JButton();
        correo = new javax.swing.JButton();
        contrasenia = new javax.swing.JButton();
        telefono = new javax.swing.JButton();
        menu = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(350, 480));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/add.png"))); // NOI18N
        crear.setContentAreaFilled(false);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        foto2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        foto2.setForeground(new java.awt.Color(0, 0, 255));
        foto2.setText("Editar foto");
        foto2.setContentAreaFilled(false);
        getContentPane().add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/photo.png"))); // NOI18N
        foto.setText("jLabel1");
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 150));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("NOMBRE OFERTANTE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        ciudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ciudad.setText("CIUDAD");
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jCheckBox1.setText("Acepto que mi n��mero sea visible p��blicamente");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tie.png"))); // NOI18N
        principal.setContentAreaFilled(false);
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }
        });
        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/no_profile.png"))); // NOI18N
        perfil.setContentAreaFilled(false);
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        getContentPane().add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/confirm.png"))); // NOI18N
        confirmar.setContentAreaFilled(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cancel.png"))); // NOI18N
        cancelar.setContentAreaFilled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        nombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombre2.setForeground(new java.awt.Color(0, 0, 255));
        nombre2.setText("Editar nombre");
        nombre2.setContentAreaFilled(false);
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 10));

        ciudad2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ciudad2.setForeground(new java.awt.Color(0, 0, 255));
        ciudad2.setText("Editar ciudad");
        ciudad2.setContentAreaFilled(false);
        getContentPane().add(ciudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 10));

        correo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        correo.setForeground(new java.awt.Color(0, 0, 255));
        correo.setText("Editar correo");
        correo.setContentAreaFilled(false);
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        contrasenia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contrasenia.setForeground(new java.awt.Color(0, 0, 255));
        contrasenia.setText("Cambiar contrase�a");
        contrasenia.setContentAreaFilled(false);
        getContentPane().add(contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 255));
        telefono.setText("Editar teléfono");
        telefono.setContentAreaFilled(false);
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu.setText("jLabel4");
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        interfazPrincipal a = new interfazPrincipal(ctrl);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_principalActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        interfazPerfil a = new interfazPerfil(ctrl);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilActionPerformed

    //crear oferta
    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
      // this.ctrl.userButtonCrearOferta(tit, desc, loc, of, trab, cand, prAc, p);
    	interfazEditarOferta c = new interfazEditarOferta(ctrl);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        interfazPerfil a = new interfazPerfil(ctrl);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_confirmarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        interfazPerfil a = new interfazPerfil(ctrl);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(interfazEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazEditarPerfil().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel ciudad;
    private javax.swing.JButton ciudad2;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton contrasenia;
    private javax.swing.JButton correo;
    private javax.swing.JButton crear;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel foto;
    private javax.swing.JButton foto2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton nombre2;
    private javax.swing.JButton perfil;
    private javax.swing.JButton principal;
    private javax.swing.JButton telefono;
    // End of variables declaration//GEN-END:variables
}
