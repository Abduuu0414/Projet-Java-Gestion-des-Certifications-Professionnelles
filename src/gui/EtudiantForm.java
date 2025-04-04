/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Etudiant;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.EtudiantService;
import static sun.font.FontManagerNativeLibrary.load;

/**
 *
 * @author admin
 */
public class EtudiantForm extends javax.swing.JInternalFrame {
    
    private EtudiantService es;
    private DefaultTableModel model;
    /**
     * Creates new form EtudiantForm
     */
    public EtudiantForm() {
        initComponents();
        this.setTitle("Gestion des Etudiants");
        setFrameIcon(new ImageIcon(getClass().getResource("/image/professional-certification-icon-logo.png")));
        es = new EtudiantService();
        model = (DefaultTableModel) listeEtudiants.getModel();
        load();
    }
    
    public void load() {
        model.setRowCount(0);
        for (Etudiant e : es.findAll()) {
            model.addRow(new Object[]{e.getId(), e.getNom(), e.getPrenom(), e.getEmail()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        bnAdd = new javax.swing.JButton();
        bnDelete = new javax.swing.JButton();
        bnUpdate = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeEtudiants = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 45, 141));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/date-icon.png"))); // NOI18N
        jLabel7.setText("Date d'inscription :");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion et Affichage des Etudiants");
        setAlignmentX(100.0F);
        setAlignmentY(100.0F);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 45, 141));
        jLabel1.setText("Nom : ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 45, 141));
        jLabel2.setText("Prenom :");

        txtNom.setForeground(new java.awt.Color(47, 45, 141));
        txtNom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPrenom.setForeground(new java.awt.Color(47, 45, 141));
        txtPrenom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bnAdd.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        bnAdd.setForeground(new java.awt.Color(92, 124, 250));
        bnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-icon.png"))); // NOI18N
        bnAdd.setText("Ajouter");
        bnAdd.setAlignmentX(0.5F);
        bnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnAdd.setPreferredSize(new java.awt.Dimension(95, 25));
        bnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddActionPerformed(evt);
            }
        });

        bnDelete.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        bnDelete.setForeground(new java.awt.Color(250, 82, 82));
        bnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        bnDelete.setText("Supprimer");
        bnDelete.setBorderPainted(false);
        bnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeleteActionPerformed(evt);
            }
        });

        bnUpdate.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        bnUpdate.setForeground(new java.awt.Color(32, 201, 151));
        bnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modify-icon.png"))); // NOI18N
        bnUpdate.setText("Modifier");
        bnUpdate.setAlignmentX(0.5F);
        bnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnUpdate.setMaximumSize(new java.awt.Dimension(123, 29));
        bnUpdate.setPreferredSize(new java.awt.Dimension(123, 29));
        bnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnUpdateActionPerformed(evt);
            }
        });

        txtEmail.setForeground(new java.awt.Color(47, 45, 141));
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(47, 45, 141));
        jLabel3.setText("Email :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(47, 45, 141));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/left-certificate-border.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 45, 141));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/right-certificate-border.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gestion-etudiant.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEmail)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bnDelete)
                        .addGap(170, 170, 170))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des etudiant", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 20), new java.awt.Color(47, 45, 141))); // NOI18N

        listeEtudiants.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 45, 141)));
        listeEtudiants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom", "Prenom", "Email"
            }
        ));
        listeEtudiants.setGridColor(new java.awt.Color(52, 52, 138));
        listeEtudiants.setSelectionBackground(new java.awt.Color(184, 239, 251));
        listeEtudiants.setSelectionForeground(new java.awt.Color(54, 54, 167));
        listeEtudiants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeEtudiantsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeEtudiants);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1)
                        .addGap(111, 111, 111))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(93, 93, 93))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddActionPerformed
        String nom = txtNom.getText().toString();
        String prenom = txtPrenom.getText().toString();
        String email = txtEmail.getText().toString();

        if (es.create(new Etudiant(nom, prenom, email))) {
            JOptionPane.showMessageDialog(this, "Étudiant ajouté avec succès");
            load();
        } else {
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout");
        }
    }//GEN-LAST:event_bnAddActionPerformed

    private void bnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteActionPerformed
        int selectedRow = listeEtudiants.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (int) model.getValueAt(selectedRow, 0);
            if (es.delete(es.findById(id))) {
                JOptionPane.showMessageDialog(this, "Étudiant supprimé avec succès");
                load();
            } else {
                JOptionPane.showMessageDialog(this, "Erreur lors de la suppression");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un étudiant");
        }
    }//GEN-LAST:event_bnDeleteActionPerformed

    private void bnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnUpdateActionPerformed
        int selectedRow = listeEtudiants.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (int) model.getValueAt(selectedRow, 0);
            String nom = txtNom.getText().toString();
            String prenom = txtPrenom.getText().toString();
            String email = txtEmail.getText().toString();

            if (es.update(new Etudiant(id, nom, prenom, email))) {
                JOptionPane.showMessageDialog(this, "Étudiant mis à jour avec succès");
                load();
            } else {
                JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un étudiant");
        }
    }//GEN-LAST:event_bnUpdateActionPerformed

    private void listeEtudiantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeEtudiantsMouseClicked

        int selectedRow = listeEtudiants.getSelectedRow();
        if (selectedRow >= 0) {
            txtNom.setText(model.getValueAt(selectedRow, 1).toString());
            txtPrenom.setText(model.getValueAt(selectedRow, 2).toString());
            txtEmail.setText(model.getValueAt(selectedRow, 3).toString());
        }
    }//GEN-LAST:event_listeEtudiantsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAdd;
    private javax.swing.JButton bnDelete;
    private javax.swing.JButton bnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listeEtudiants;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
}
