/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Certification;
import beans.Etudiant;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import services.CertificationService;
import services.EtudiantService;

/**
 *
 * @author admin
 */
public class EtudiantParCertification extends javax.swing.JInternalFrame {
    
    private CertificationService cs;
    private EtudiantService es;
    private DefaultTableModel model;
    
    /**
     * Creates new form EtudiantParCertification
     */
    public EtudiantParCertification() {
        initComponents();
        this.setTitle("Étudiants par Certification");
        setFrameIcon(new ImageIcon(getClass().getResource("/image/professional-certification-icon-logo.png")));
        cs = new CertificationService();
        es = new EtudiantService();
        model = (DefaultTableModel) listeEtudiants.getModel();
        loadCertifications();
        load();
    }
    
    public void loadCertifications() {
        listCertification.addItem("Choisir une certification");
        for (Certification c : cs.findAll()) {
            listCertification.addItem(c);
        }
    }
    
    public void load() {
        model.setRowCount(0);
        for (Etudiant e : es.findAll()) {
            model.addRow(new Object[]{
                e.getId(),
                e.getNom(),
                e.getPrenom(),
                e.getEmail()
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listCertification = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeEtudiants = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des Etudiants"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Affichage Etudiants par Certification");
        setAlignmentX(100.0F);
        setAlignmentY(100.0F);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(47, 45, 141));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 45, 141));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/certificate-icon.png"))); // NOI18N
        jLabel1.setText("Certification : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 40));

        listCertification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCertificationActionPerformed(evt);
            }
        });
        jPanel1.add(listCertification, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 305, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-certificate.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 140));

        jPanel2.setBackground(new java.awt.Color(201, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Etudiants", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18), new java.awt.Color(29, 140, 171))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 407));

        listeEtudiants.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 45, 141), 2));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listCertificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCertificationActionPerformed
        model.setRowCount(0);
        if (listCertification.getSelectedIndex() != 0) {
            Certification selectedCertification = (Certification) listCertification.getSelectedItem();
            for (Etudiant e : es.findByCertification(selectedCertification)) {
                model.addRow(new Object[]{
                    e.getId(),
                    e.getNom(),
                    e.getPrenom(),
                    e.getEmail()
                });
            }
        }
    }//GEN-LAST:event_listCertificationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox listCertification;
    private javax.swing.JTable listeEtudiants;
    // End of variables declaration//GEN-END:variables
}
