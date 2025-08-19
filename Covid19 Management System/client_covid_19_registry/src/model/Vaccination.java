
package model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Admin
 */


public class Vaccination implements Serializable{
   
    private Integer id;
    private String vaccination_brand;
    private Date vaccination_date;
    private String citizen_fk;
    public Vaccination() {
    }

    public Vaccination(Integer id, String vaccination_brand, Date vaccination_date, String citizen_fk) {
        this.id = id;
        this.vaccination_brand = vaccination_brand;
        this.vaccination_date = vaccination_date;
        this.citizen_fk = citizen_fk;
    }

  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public String getVaccination_brand() {
        return vaccination_brand;
    }

    public void setVaccination_brand(String vaccination_brand) {
        this.vaccination_brand = vaccination_brand;
    }

    public Date getVaccination_date() {
        return vaccination_date;
    }

    public void setVaccination_date(Date vaccination_date) {
        this.vaccination_date = vaccination_date;
    }

    public String getCitizen_fk() {
        return citizen_fk;
    }

    public void setCitizen_fk(String citizen_fk) {
        this.citizen_fk = citizen_fk;
    }


    
    
}
