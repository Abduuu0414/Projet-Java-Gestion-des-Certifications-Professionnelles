/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import services.UserService;

/**
 *
 * @author admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setTitle("Authentification");
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/image/professional-certification-icon-logo.png")).getImage());
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
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        bnConnexion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(48, 48, 119));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/username-icon.png"))); // NOI18N
        jLabel1.setText(" Login :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 48, 119));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/password-icon.png"))); // NOI18N
        jLabel2.setText(" Mot de passe :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        txtLogin.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        txtLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLogin.setDisabledTextColor(new java.awt.Color(37, 37, 126));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 360, 30));

        txtPassword.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 360, 30));

        bnConnexion.setBackground(new java.awt.Color(55, 55, 127));
        bnConnexion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bnConnexion.setForeground(new java.awt.Color(255, 255, 255));
        bnConnexion.setText("Connexion");
        bnConnexion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnConnexion.setBorderPainted(false);
        bnConnexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnConnexionActionPerformed(evt);
            }
        });
        jPanel1.add(bnConnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 370, 40));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 48, 119));
        jLabel5.setText("Certification Professionelles");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(48, 48, 119));
        jLabel4.setText("mot de passe oublie?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setDoubleBuffered(true);
        jLabel4.setFocusCycleRoot(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 140, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login-page.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void bnConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnConnexionActionPerformed
        String login = txtLogin.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();

        UserService userService = new UserService();

        if (userService.authenticate(login, password)) {
            MDIApplication mdi = MDIApplication.getInstance();
            mdi.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Login ou mot de passe incorrect");
        }
    }//GEN-LAST:event_bnConnexionActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // Demander à l'utilisateur de saisir son login
        String login = JOptionPane.showInputDialog(this, "Veuillez saisir votre login :");

        if (login != null && !login.trim().isEmpty()) {
            UserService userService = new UserService();

            // Verifier si le login existe
            if (userService.userExists(login)) {
                // Demander a l'utilisateur de saisir un nouveau mot de passe
                String newPassword = JOptionPane.showInputDialog(this, "Veuillez saisir votre nouveau mot de passe :");

                if (newPassword != null && !newPassword.trim().isEmpty()) {
                    // Mettre a jour le mot de passe dans la base de donnees
                    if (userService.updatePassword(login, newPassword)) {
                        JOptionPane.showMessageDialog(this, "Mot de passe mis à jour avec succès !");
                    } else {
                        JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour du mot de passe.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Le mot de passe ne peut pas être vide.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Login introuvable.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Le login ne peut pas être vide.");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnConnexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
