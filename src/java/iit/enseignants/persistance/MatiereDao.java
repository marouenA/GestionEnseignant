/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.persistance;

import iit.enseignants.entites.Matiere;
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
public class MatiereDao {
     public Matiere addMatiere(Matiere a)
    {
        Statement st=JdbcUtil.getStatement();
        String req="Insert into matiere (libelle ,charge_horaire_tp ,charge_horaire_td,charge_horaire_cours )values( '"+a.getLibelle()+"', '"+a.getTp()+"', '"+a.getTd()+"', '"+a.getCours()+"');";
        System.out.println(req);
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(MatiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
    public List<Matiere> getAllMatiere()
    {
        Statement st=JdbcUtil.getStatement();
        String req="select * from matiere ;";
        List<Matiere> list=new ArrayList<Matiere>();
        try {
            ResultSet rs=st.executeQuery(req);
            
            while(rs.next())
            {
                Matiere a=new Matiere(rs.getString("libelle"),  rs.getString("tp"), rs.getString("td"), rs.getString("cours"));
                list.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MatiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    public Matiere updateMatiere(Matiere a)
    {
        Statement st=JdbcUtil.getStatement();
        String req="Update matiere set tp="+a.getTp()+", td="+a.getTd()+", cours="+a.getCours();
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(MatiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return getMatiereByDesignation(a.getId_matiere());
    }
    
    public void removeMatiere(Matiere a)
    {
        
        Statement st=JdbcUtil.getStatement();
        String req="remove From matiere where id_matiere like '"+a.getId_matiere()+"';";
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(MatiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Matiere getMatiereByDesignation(int id_matiere)
    {
        Statement st=JdbcUtil.getStatement();
        String req="select * from matiere where id_matiere like '"+id_matiere+"';";
        Matiere a=null;
        try {
            ResultSet rs=st.executeQuery(req);
            
            while(rs.next())
                a=new Matiere(rs.getString("libelle"),  rs.getString("tp"), rs.getString("td"), rs.getString("cours"));
            
        } catch (SQLException ex) {
            Logger.getLogger(MatiereDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
}
