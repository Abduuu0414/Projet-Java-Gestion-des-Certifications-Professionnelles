/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Certification;
import beans.InscriptionCertification;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import services.CertificationService;
import services.InscriptionCertificationService;

/**
 *
 * @author admin
 */
public class InscriptionParCertification extends javax.swing.JInternalFrame {
    
    private CertificationService cs;
    private InscriptionCertificationService ics;
    private DefaultTableModel model;
    
    /**
     * Creates new form InscriptionParCertification
     */
    public InscriptionParCertification() {
        initComponents();
        this.setTitle("Inscriptions par Certification");
        setFrameIcon(new ImageIcon(getClass().getResource("/image/professional-certification-icon-logo.png")));
        cs = new CertificationService();
        ics = new InscriptionCertificationService();
        model = (DefaultTableModel) listeInscriptions.getModel();
        loadCertifications();
        load();
    }
    
    /**
     * Charge les certifications dans la liste déroulante.
     */
    public void loadCertifications() {
        listCertification1.addItem("Choisir une certification");
        for (Certification c : cs.findAll()) {
            listCertification1.addItem(c);
        }
    }
    
    public void load() {
        model.setRowCount(0);
        for (InscriptionCertification ic : ics.findAll()) {
            model.addRow(new Object[]{
                ic.getCertification().getNom(),
                ic.getEtudiant().getNom(),
                ic.getDateInscription()
            });
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listeInscriptions = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listCertification3 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeEtudiants = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listCertification1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Affichage Inscriptions par Certification");
        setAlignmentX(100.0F);
        setAlignmentY(100.0F);
        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des inscriptions"));
        jPanel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jPanel5.setLayout(new java.awt.GridBagLayout());

        listeInscriptions.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listeInscriptions.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        listeInscriptions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Certification", "Etudiant", "Date d'inscription"
            }
        ));
        jScrollPane3.setViewportView(listeInscriptions);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 663;
        gridBagConstraints.ipady = 217;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(59, 39, 163, 51);
        jPanel5.add(jScrollPane3, gridBagConstraints);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 780, 470));

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des Etudiants"));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Affichage Etudiants par Certification");
        jInternalFrame1.setAlignmentX(100.0F);
        jInternalFrame1.setAlignmentY(100.0F);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(800, 600));
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choix de Certification"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Certification : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 40));

        listCertification3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCertification3ActionPerformed(evt);
            }
        });
        jPanel1.add(listCertification3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 305, -1));

        jInternalFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 860, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des Etudiants"));

        listeEtudiants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prenom", "Email"
            }
        ));
        jScrollPane1.setViewportView(listeEtudiants);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 860, 400));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 273, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Choix de Certification"));
        jPanel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Certification : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 180, 70, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        listCertification1.setForeground(new java.awt.Color(204, 204, 255));
        listCertification1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listCertification1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCertification1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 274;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 29, 0, 185);
        jPanel3.add(listCertification1, gridBagConstraints);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 160));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listCertification3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCertification3ActionPerformed
        model.setRowCount(0); // Vider le tableau
        if (listCertification3.getSelectedIndex() != 0) {
            Certification selectedCertification = (Certification) listCertification3.getSelectedItem();
            for (InscriptionCertification ic : ics.findByCertification(selectedCertification)) {
                model.addRow(new Object[]{
                    ic.getCertification().getNom(), // Certification
                    ic.getEtudiant().getNom(),     // Etudiant
                    ic.getDateInscription() 
                });
            }
        }
    }//GEN-LAST:event_listCertification3ActionPerformed

    private void listCertification1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCertification1ActionPerformed
        model.setRowCount(0); // Vider le tableau
        if (listCertification1.getSelectedIndex() != 0) {
            Certification selectedCertification = (Certification) listCertification1.getSelectedItem();
            for (InscriptionCertification ic : ics.findByCertification(selectedCertification)) {
                model.addRow(new Object[]{
                    ic.getCertification().getNom(), // Certification
                    ic.getEtudiant().getNom(),     // Etudiant
                    ic.getDateInscription() 
                });
            }
        }
    }//GEN-LAST:event_listCertification1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox listCertification1;
    private javax.swing.JComboBox listCertification3;
    private javax.swing.JTable listeEtudiants;
    private javax.swing.JTable listeInscriptions;
    // End of variables declaration//GEN-END:variables
}
