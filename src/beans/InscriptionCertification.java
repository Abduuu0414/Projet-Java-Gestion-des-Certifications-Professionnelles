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
    private int id;
    private int certificationId;
    private int etudiantId;
    private Date dateInscription;

    public InscriptionCertification(int certificationId, int etudiantId, Date dateInscription) {
        this.certificationId = certificationId;
        this.etudiantId = etudiantId;
        this.dateInscription = dateInscription;
    }
    
    public InscriptionCertification(int id, int certificationId, int etudiantId, Date dateInscription) {
        this.id = id;
        this.certificationId = certificationId;
        this.etudiantId = etudiantId;
        this.dateInscription = dateInscription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(int certificationId) {
        this.certificationId = certificationId;
    }

    public int getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(int etudiantId) {
        this.etudiantId = etudiantId;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
}
