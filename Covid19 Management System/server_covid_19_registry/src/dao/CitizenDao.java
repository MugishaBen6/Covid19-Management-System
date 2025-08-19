/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Citizen;
import org.hibernate.*;

/**
 *
 * @author Admin
 */
public class CitizenDao {
    //create operation
    
    public String registerCitizen(Citizen citizen){
        //
        Session ss =HibernateUtil.getSessionFactory().openSession();
        //create transaction
        Transaction tr = ss.beginTransaction();
        
        ss.save(citizen);
        tr.commit();
        ss.close();
        return "Data saved Successful";
    }
    
    //update operation
    
     public String updateCitizen(Citizen citizen){
        //
        Session ss =HibernateUtil.getSessionFactory().openSession();
        //create transaction
        Transaction tr = ss.beginTransaction();
        //save citizen
        Citizen cit = getCitizenById(citizen);
        if(cit != null){
            cit.setIs_vaccinate(citizen.isIs_vaccinate());
        
            ss.update(cit);
        }
        
        tr.commit();
        ss.close();
        return "Data updated Successful";
    }
     
     //delete operation
     
      public String deleteCitizen(Citizen citizen){
        //
        Session ss =HibernateUtil.getSessionFactory().openSession();
        //create transaction
        Transaction tr = ss.beginTransaction();
        //save citizen
        ss.delete(citizen);
        tr.commit();
        ss.close();
        return "Citizen Deleted Successful";
    }
      // read or to select from Database
      
      public List<Citizen> allCitizen(){
         Session ss =HibernateUtil.getSessionFactory().openSession();
         List<Citizen> citizenList = ss.createQuery("select cit from Citizen cit").list();
         ss.close();
         return citizenList;
      }
      
      //search Citizen By Id 
      public Citizen getCitizenById(Citizen citizen){
          Session ss =HibernateUtil.getSessionFactory().openSession();
          Citizen cit = (Citizen) ss.get(Citizen.class, citizen.getCitizen_id());
          ss.close();
          return cit;
      }
}
