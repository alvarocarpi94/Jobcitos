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
public class interfazOferta extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form interfazOferta
     */
    public interfazOferta() {
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

        buscar2 = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        fav = new javax.swing.JToggleButton();
        principal = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        oferta = new javax.swing.JButton();
        chat = new javax.swing.JButton();
        jobcito = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        buscar1 = new javax.swing.JTextField();
        empresa = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        job = new javax.swing.JLabel();
        ofertante = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
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

        fav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/star1.jpg"))); // NOI18N
        fav.setContentAreaFilled(false);
        fav.setRolloverEnabled(false);
        fav.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/star2.png"))); // NOI18N
        getContentPane().add(fav, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, 40));

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

        oferta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        oferta.setForeground(new java.awt.Color(0, 102, 102));
        oferta.setText("NOMBRE OFERTA");
        oferta.setContentAreaFilled(false);
        getContentPane().add(oferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, -1));

        chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/chat.png"))); // NOI18N
        chat.setContentAreaFilled(false);
        chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatActionPerformed(evt);
            }
        });
        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jobcito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/handshake.png"))); // NOI18N
        jobcito.setContentAreaFilled(false);
        jobcito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobcitoActionPerformed(evt);
            }
        });
        getContentPane().add(jobcito, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/arrow.png"))); // NOI18N
        volver.setContentAreaFilled(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 30));

        empresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo1.png"))); // NOI18N
        getContentPane().add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        descripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descripcion.setText("Descripción");
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/photo2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, -1));

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, 70));

        job.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        job.setForeground(new java.awt.Color(0, 51, 255));
        job.setText("¡Quiero este Jobcito!");
        getContentPane().add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 130, -1));

        ofertante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ofertante.setText("Ofertante");
        getContentPane().add(ofertante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setText("NOMBRE OFERTANTE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        ciudad.setText("CIUDAD");
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu1.setText("jLabel1");
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 62));

        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu2.setText("jLabel1");
        getContentPane().add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        interfazPerfil a = new interfazPerfil();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        interfazPrincipal a = new interfazPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        interfazPrincipal a = new interfazPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_principalActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        interfazEditarOferta c = new interfazEditarOferta();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearActionPerformed

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
        interfazAux e = new interfazAux();
        e.setVisible(true);
    }//GEN-LAST:event_chatActionPerformed

    private void jobcitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobcitoActionPerformed
        interfazAux e = new interfazAux();
        e.setVisible(true);
    }//GEN-LAST:event_jobcitoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        interfazVerPerfil f = new interfazVerPerfil();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazOferta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton chat;
    private javax.swing.JLabel ciudad;
    private javax.swing.JButton crear;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel empresa;
    private javax.swing.JToggleButton fav;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel job;
    private javax.swing.JButton jobcito;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel menu2;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton oferta;
    private javax.swing.JLabel ofertante;
    private javax.swing.JButton perfil;
    private javax.swing.JButton principal;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
