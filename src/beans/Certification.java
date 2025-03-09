/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


/**
 *
 * @author admin
 */
public class Certification {
    private int id;
    private String nom;
    private String organisme;
    private double cout;

    public Certification(String nom, String organisme, double cout) {
        this.nom = nom;
        this.organisme = organisme;
        this.cout = cout;
    }
    
    public Certification(int id, String nom, String organisme, double cout) {
        this.id = id;
        this.nom = nom;
        this.organisme = organisme;
        this.cout = cout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }
    
    
    
}
