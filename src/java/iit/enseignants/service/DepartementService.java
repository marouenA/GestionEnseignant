/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.service;

import iit.enseignants.entites.Departement;
import iit.enseignants.persistance.DepartementDao;

/**
 *
 * @author Lenovo
 */
public class DepartementService {
  DepartementDao DepartementDao=new DepartementDao();
    public void addDepartement( String libelle_Departement)
    {
        DepartementDao.addDepartement(new Departement( libelle_Departement));
    }
}
