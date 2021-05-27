/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.service;

import iit.enseignants.entites.Matiere;
import iit.enseignants.persistance.MatiereDao;

/**
 *
 * @author Lenovo
 */
public class MatiereService {
    MatiereDao matiereDao=new MatiereDao();
    public void addMatiere( String libelle, String tp , String td,String cours)
    {
        matiereDao.addMatiere(new Matiere( libelle, tp, td,cours));
    }
    
    
    
    
}
