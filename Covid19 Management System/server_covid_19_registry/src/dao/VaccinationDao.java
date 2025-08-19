/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Vaccination;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class VaccinationDao {
    // CRUD
    
     public String vaccinationRegistry(Vaccination vaccination){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction tr = ss.beginTransaction();
    ss.save(vaccination);
    tr.commit();
    ss.close();
    return "Data Save Successful!";
    }
     //update
    
      public String vaccinationUpdate(Vaccination vaccination){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction tr = ss.beginTransaction();
    ss.update(vaccination);
    tr.commit();
    ss.close();
    return "Data Save Successful!";
    }
      //delete
       public String vaccinationDelete(Vaccination vaccination){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction tr = ss.beginTransaction();
    ss.delete(vaccination);
    tr.commit();
    ss.close();
    return "Data Save Successful!";
    }
       
       //search
       public List<Vaccination> allVaccinatedCitizen(){
           
           Session ss = HibernateUtil.getSessionFactory().openSession();
           List<Vaccination> vaccinationList = ss.createQuery("select vac from Vaccination vac").list();
           
           ss.clear();
           return vaccinationList;
           
           
       }
       
       public Vaccination getVaccinatedById(Vaccination vaccination){
           Session ss = HibernateUtil.getSessionFactory() .openSession();
           Vaccination vac = (Vaccination)ss.get(Vaccination.class, vaccination.getId());
           
           return vac;
       }
}
