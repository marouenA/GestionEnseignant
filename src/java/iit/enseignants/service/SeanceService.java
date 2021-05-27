/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.service;

import iit.enseignants.entites.Seance;
import iit.enseignants.persistance.SeanceDao;

/**
 *
 * @author Lenovo
 */
public class SeanceService {
    SeanceDao seanceDao=new SeanceDao();
     public void addSeance( String date, String heure_debut, String duree, int validee, String type)
    {
        seanceDao.addSeance(new Seance( date, heure_debut, duree,validee,type));
    }
    
}
