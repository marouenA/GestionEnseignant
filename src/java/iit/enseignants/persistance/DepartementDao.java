/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.persistance;

import iit.enseignants.entites.Departement;
import iit.enseignants.utils.JdbcUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DepartementDao {
    public Departement addDepartement(Departement a)
    {
        Statement st=JdbcUtil.getStatement();
        String req="Insert into departement (`libelle_departement`)values( '"+a.getLibelle_departement()+"');";
        System.out.println(req);
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
    public List<Departement> getAllDepartement()
    {
        Statement st=JdbcUtil.getStatement();
        String req="select * from departement ;";
        List<Departement> list=new ArrayList<Departement>();
        try {
            ResultSet rs=st.executeQuery(req);
            
            while(rs.next())
            {
                 Departement a=new Departement(rs.getString("departement"));
                list.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    public Departement updateDepartement(Departement a)
    {
        Statement st=JdbcUtil.getStatement();
        String req="Update departement set libelle="+a.getLibelle_departement();
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return getDepartementByDesignation(a.getId_departement());
    }
    
    public void removeDepartement(Departement a)
    {
        
        Statement st=JdbcUtil.getStatement();
        String req="remove From departement where id_departement like '"+a.getId_departement()+"';";
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Departement getDepartementByDesignation(int id_departement)
    {
        Statement st=JdbcUtil.getStatement();
        String req="select * from departement where id_departement like '"+id_departement+"';";
        Departement a=null;
        try {
            ResultSet rs=st.executeQuery(req);
            
            while(rs.next())
                a=new Departement(rs.getString("libelle_departement"));
            
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
}
