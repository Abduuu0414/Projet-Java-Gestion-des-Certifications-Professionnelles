/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Certification;
import beans.Etudiant;
import beans.InscriptionCertification;
import services.CertificationService;
import services.EtudiantService;
import services.InscriptionCertificationService;

import java.util.Date;
import java.util.List;
/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) {

        CertificationService cs = new CertificationService();
        EtudiantService es = new EtudiantService();
        InscriptionCertificationService ics = new InscriptionCertificationService();
   
        cs.create(new Certification("Java OCP", "Oracle", 300.0));
        cs.create(new Certification("PMP", "PMI", 500.0));

        Certification certification = cs.findById(1);
        if (certification != null) {
            System.out.println("Certification trouvée : " + certification.getNom());
        }

        certification.setCout(350.0);
        cs.update(certification);
        System.out.println("Coût de la certification mis à jour : " + cs.findById(1).getCout());

        List<Certification> certifications = cs.findAll();
        for (Certification c : certifications) {
            System.out.println(c.getNom() + " - " + c.getOrganisme() + " - " + c.getCout());
        }

        es.create(new Etudiant("Bouanani", "Abderrahman", "Bouanani@example.com"));
        es.create(new Etudiant("Aboulaiche", "Yassine", "Aboulaiche@example.com"));

        Etudiant etudiant = es.findById(1);
        if (etudiant != null) {
            System.out.println("Étudiant trouvé : " + etudiant.getNom() + " " + etudiant.getPrenom());
        }

        etudiant.setEmail("Bouanani.new@example.com");
        es.update(etudiant);
        System.out.println("Email de l'étudiant mis à jour : " + es.findById(1).getEmail());

        List<Etudiant> etudiants = es.findAll();
        for (Etudiant e : etudiants) {
            System.out.println(e.getNom() + " " + e.getPrenom() + " - " + e.getEmail());
        }

        ics.create(new InscriptionCertification(cs.findById(1), es.findById(1), new Date()));
        ics.create(new InscriptionCertification(cs.findById(2), es.findById(2), new Date()));

        List<InscriptionCertification> inscriptions = ics.findAll();
        for (InscriptionCertification ic : inscriptions) {
            System.out.println("Inscription : " + ic.getEtudiant().getNom() + " est inscrit à " + ic.getCertification().getNom());
        }

        InscriptionCertification inscriptionToDelete = ics.findAll().get(0);
        ics.delete(inscriptionToDelete);
        System.out.println("Inscription supprimée : " + inscriptionToDelete.getEtudiant().getNom() + " - " + inscriptionToDelete.getCertification().getNom());

        System.out.println("\nInscriptions restantes :");
        for (InscriptionCertification ic : ics.findAll()) {
            System.out.println("Inscription : " + ic.getEtudiant().getNom() + " est inscrit à " + ic.getCertification().getNom());
        }
    }
}
