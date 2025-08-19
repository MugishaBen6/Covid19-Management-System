
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */

public class Citizen implements Serializable{
    private String citizen_id;
    private String fullnames;
    private String phone_number;
    private boolean is_vaccinate;
    
    // no-args constructor

    public Citizen() {
    }

    public Citizen(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    public Citizen(String citizen_id, String fullnames, String phone_number) {
        this.citizen_id = citizen_id;
        this.fullnames = fullnames;
        this.phone_number = phone_number;
    }

    public boolean isIs_vaccinate() {
        return is_vaccinate;
    }

    public void setIs_vaccinate(boolean is_vaccinate) {
        this.is_vaccinate = is_vaccinate;
    }
    
    

    public String getCitizen_id() {
        return citizen_id;
    }

    public void setCitizen_id(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    
    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
}
