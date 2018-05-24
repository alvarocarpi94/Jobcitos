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
public class interfazEditarOferta extends javax.swing.JFrame {

    /**
     * Creates new form interfazEditarOferta
     */
    public interfazEditarOferta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        descripcion = new javax.swing.JLabel();
        descripcion2 = new javax.swing.JButton();
        nombre2 = new javax.swing.JButton();
        salario = new javax.swing.JButton();
        principal = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        datos = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        empresa = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        menu2 = new javax.swing.JLabel();
        menu1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(350, 480));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Añadir imagen");
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/add.png"))); // NOI18N
        crear.setContentAreaFilled(false);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        descripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descripcion.setText("Descripción");
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        descripcion2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        descripcion2.setForeground(new java.awt.Color(0, 0, 255));
        descripcion2.setText("Editar");
        descripcion2.setContentAreaFilled(false);
        descripcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcion2ActionPerformed(evt);
            }
        });
        getContentPane().add(descripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 233, -1, 30));

        nombre2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombre2.setForeground(new java.awt.Color(0, 0, 255));
        nombre2.setText("Editar nombre");
        nombre2.setContentAreaFilled(false);
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, 20));

        salario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salario.setForeground(new java.awt.Color(0, 0, 255));
        salario.setText("Editar salario");
        salario.setContentAreaFilled(false);
        getContentPane().add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

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

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscar.png"))); // NOI18N
        buscar.setContentAreaFilled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -1, 70, 50));

        datos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        datos.setForeground(new java.awt.Color(0, 0, 255));
        datos.setText("Editar datos");
        datos.setContentAreaFilled(false);
        getContentPane().add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 30));

        empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo1.png"))); // NOI18N
        getContentPane().add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 153, 153));
        nombre.setText("NOMBRE OFERTA");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu2.setText("jLabel2");
        getContentPane().add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo1.png"))); // NOI18N
        menu1.setText("jLabel3");
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descripcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcion2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        interfazEditarOferta c = new interfazEditarOferta();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        interfazOferta b = new interfazOferta();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_confirmarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        interfazPerfil a = new interfazPerfil();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        interfazPerfil a = new interfazPerfil();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilActionPerformed

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        interfazPrincipal a = new interfazPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_principalActionPerformed

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
            java.util.logging.Logger.getLogger(interfazEditarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazEditarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazEditarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazEditarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazEditarOferta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton crear;
    private javax.swing.JButton datos;
    private javax.swing.JLabel descripcion;
    private javax.swing.JButton descripcion2;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel menu2;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton nombre2;
    private javax.swing.JButton perfil;
    private javax.swing.JButton principal;
    private javax.swing.JButton salario;
    // End of variables declaration//GEN-END:variables
}
