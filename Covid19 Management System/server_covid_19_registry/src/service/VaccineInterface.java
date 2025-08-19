
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Vaccination;

/**
 *
 * @author Admin
 */
public interface VaccineInterface extends Remote{
    public String vaccineRegister(Vaccination vac) throws RemoteException;
    public String vaccineUpdate(Vaccination vac) throws RemoteException;
    public String vaccineDeleteRecord(Vaccination vac) throws RemoteException;
    public List<Vaccination> getVaccinatedRecord() throws RemoteException;
    public Vaccination getVaccinetedCitezById(Vaccination vac) throws RemoteException;
    
}
