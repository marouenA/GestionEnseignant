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
public class Seance {
     int id_seance;
    String date;
    String heure_debut;
    String duree;
    int validee;
    String type;

    public int getId_seance() {
        return id_seance;
    }

    public void setId_seance(int id_seance) {
        this.id_seance = id_seance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure_debut() {
        return heure_debut;
    }

    public void setHeure_debut(String heure_debut) {
        this.heure_debut = heure_debut;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getValidee() {
        return validee;
    }

    public void setValidee(int validee) {
        this.validee = validee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Seance(String date, String heure_debut, String duree, int validee, String type) {
        this.date = date;
        this.heure_debut = heure_debut;
        this.duree = duree;
        this.validee = validee;
        this.type = type;
    }
    
    
}
