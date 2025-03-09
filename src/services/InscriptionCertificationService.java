/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import beans.Certification;
import beans.Etudiant;
import beans.InscriptionCertification;
import connexion.Connexion;
import dao.IDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class InscriptionCertificationService implements IDao<InscriptionCertification> {

    private Connexion connexion;
    private CertificationService cs;
    private EtudiantService es;

    public InscriptionCertificationService() {
        connexion = Connexion.getInstance();
        cs = new CertificationService();
        es = new EtudiantService();
    }

    @Override
    public boolean create(InscriptionCertification o) {
        String req = "INSERT INTO InscriptionCertification (certification_id, etudiant_id, date_inscription) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = connexion.getCn().prepareStatement(req);
            ps.setInt(1, o.getCertification().getId());
            ps.setInt(2, o.getEtudiant().getId());
            ps.setDate(3, new java.sql.Date(o.getDateInscription().getTime()));
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(InscriptionCertification o) {
        String req = "DELETE FROM InscriptionCertification WHERE certification_id = ? AND etudiant_id = ?";
        try {
            PreparedStatement ps = connexion.getCn().prepareStatement(req);
            ps.setInt(1, o.getCertification().getId());
            ps.setInt(2, o.getEtudiant().getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(InscriptionCertification o) {
        String req = "UPDATE InscriptionCertification SET date_inscription = ? WHERE certification_id = ? AND etudiant_id = ?";
        try {
            PreparedStatement ps = connexion.getCn().prepareStatement(req);
            ps.setDate(1, new java.sql.Date(o.getDateInscription().getTime()));
            ps.setInt(2, o.getCertification().getId());
            ps.setInt(3, o.getEtudiant().getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public InscriptionCertification findById(int id) {
        // Cette méthode n'est pas applicable car InscriptionCertification n'a pas d'ID unique.
        return null;
    }

    @Override
    public List<InscriptionCertification> findAll() {
        List<InscriptionCertification> inscriptions = new ArrayList<>();
        String req = "SELECT * FROM InscriptionCertification";
        try {
            PreparedStatement ps = connexion.getCn().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Certification certification = cs.findById(rs.getInt("certification_id"));
                Etudiant etudiant = es.findById(rs.getInt("etudiant_id"));
                Date dateInscription = rs.getDate("date_inscription");
                inscriptions.add(new InscriptionCertification(certification, etudiant, dateInscription));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return inscriptions;
    }
}
