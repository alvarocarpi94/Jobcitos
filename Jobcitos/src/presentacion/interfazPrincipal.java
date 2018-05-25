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
public class interfazPrincipal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form interfazPrincipal
     */
    public interfazPrincipal() {
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

        perfil = new javax.swing.JButton();
        principal = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        oferta1 = new javax.swing.JButton();
        oferta2 = new javax.swing.JButton();
        oferta3 = new javax.swing.JButton();
        desc1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        desc3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
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
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 30));

        jScrollBar1.setBackground(new java.awt.Color(51, 51, 255));
        jScrollBar1.setForeground(new java.awt.Color(0, 51, 204));
        jScrollBar1.setOpaque(false);
        getContentPane().add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 20, 370));

        oferta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oferta1.setForeground(new java.awt.Color(51, 102, 255));
        oferta1.setText("OFERTA 1");
        oferta1.setContentAreaFilled(false);
        oferta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oferta1ActionPerformed(evt);
            }
        });
        getContentPane().add(oferta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, -1));

        oferta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oferta2.setForeground(new java.awt.Color(51, 102, 255));
        oferta2.setText("OFERTA 2");
        oferta2.setContentAreaFilled(false);
        oferta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oferta2ActionPerformed(evt);
            }
        });
        getContentPane().add(oferta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 190, 100, -1));

        oferta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oferta3.setForeground(new java.awt.Color(51, 102, 255));
        oferta3.setText(" OFERTA 3");
        oferta3.setContentAreaFilled(false);
        oferta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oferta3ActionPerformed(evt);
            }
        });
        getContentPane().add(oferta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 100, -1));

        desc1.setText("Descripcion");
        getContentPane().add(desc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        desc2.setText("Descripcion");
        getContentPane().add(desc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        desc3.setText("Descripcion");
        getContentPane().add(desc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 300, 60));

        jTextPane4.setEditable(false);
        jTextPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 300, 60));

        jTextPane5.setEditable(false);
        jTextPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane5.setViewportView(jTextPane5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 300, 60));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 330, 20));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 330, 20));

        empresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo1.png"))); // NOI18N
        getContentPane().add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu1.setText("jLabel3");
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu2.setText("jLabel2");
        getContentPane().add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 62));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        interfazPerfil a = new interfazPerfil();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilActionPerformed

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        //
    }//GEN-LAST:event_principalActionPerformed

    private void oferta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oferta1ActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_oferta1ActionPerformed

    private void oferta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oferta2ActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_oferta2ActionPerformed

    private void oferta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oferta3ActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_oferta3ActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        interfazEditarOferta c = new interfazEditarOferta();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearActionPerformed

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
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton crear;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel desc3;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel menu2;
    private javax.swing.JButton oferta1;
    private javax.swing.JButton oferta2;
    private javax.swing.JButton oferta3;
    private javax.swing.JButton perfil;
    private javax.swing.JButton principal;
    // End of variables declaration//GEN-END:variables
}
