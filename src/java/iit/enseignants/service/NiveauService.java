/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.service;


import iit.enseignants.entites.Niveau;
import iit.enseignants.persistance.NiveauDao;


/**
 *
 * @author Lenovo
 */
public class NiveauService {
   NiveauDao niveauDao=new NiveauDao();
    public void addNiveau( String libelle)
    {
        niveauDao.addNiveau(new Niveau( libelle));
    }
}
