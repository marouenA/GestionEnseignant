/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.enseignants.persistance;


import iit.enseignants.entites.Seance;
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
public class SeanceDao {
        public Seance addSeance(Seance a)
    {
        Statement st=JdbcUtil.getStatement();
        String req="Insert into seance ( date,heure_debut, duree,  validee,  type)values( '"+a.getDate()+"', '"+a.getHeure_debut()+"', '"+a.getDuree()+"', "+a.getValidee()+",'"+a.getType()+"');";
        System.out.println(req);
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
    public List<Seance> getAllSeance()
    {
        Statement st=JdbcUtil.getStatement();
        String req="select * from seance ;";
        List<Seance> list=new ArrayList<Seance>();
        try {
            ResultSet rs=st.executeQuery(req);
            
            while(rs.next())
            {
                Seance a=new Seance(rs.getString("date"),  rs.getString("heure_debut"), rs.getString("duree"), rs.getInt("validee"), rs.getString("type"));
                list.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    public Seance updateSeance(Seance a)
    {
        Statement st=JdbcUtil.getStatement();
        String req="Update seance set date="+a.getDate()+",heure_debut="+a.getHeure_debut()+", duree="+a.getDuree()+", validee="+a.getValidee()+", type="+a.getType();
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return getSeanceByDesignation(a.getId_seance());
    }
    
    public void removeSeance(Seance a)
    {
        
        Statement st=JdbcUtil.getStatement();
        String req="remove From seance where id_seance like '"+a.getId_seance()+"';";
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Seance getSeanceByDesignation(int id_seance)
    {
        Statement st=JdbcUtil.getStatement();
        String req="select * from seance where id_seance like '"+id_seance+"';";
        Seance a=null;
        try {
            ResultSet rs=st.executeQuery(req);
            
            while(rs.next())
                a=new Seance(rs.getString("date"),  rs.getString("heure_debut"), rs.getString("duree"), rs.getInt("validee"), rs.getString("type"));
            
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
}
