/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.entites;

/**
 *
 * @author Lenovo
 */
public class Departement {
    int id_departement;
    String libelle_departement;

    public int getId_departement() {
        return id_departement;
    }

    public void setId_departement(int id_departement) {
        this.id_departement = id_departement;
    }

    public String getLibelle_departement() {
        return libelle_departement;
    }

    public void setLibelle_departement(String libelle_departement) {
        this.libelle_departement = libelle_departement;
    }

    public Departement(String libelle_departement) {
        this.libelle_departement = libelle_departement;
    }
    

    
}
