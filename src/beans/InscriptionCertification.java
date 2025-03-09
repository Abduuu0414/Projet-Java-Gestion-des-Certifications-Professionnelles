/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author admin
 */

public class InscriptionCertification {
    private Certification certification;
    private Etudiant etudiant;
    private Date dateInscription;

    public InscriptionCertification(Certification certification, Etudiant etudiant, Date dateInscription) {
        this.certification = certification;
        this.etudiant = etudiant;
        this.dateInscription = dateInscription;
    }

    public Certification getCertification() {
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
    
    
}
