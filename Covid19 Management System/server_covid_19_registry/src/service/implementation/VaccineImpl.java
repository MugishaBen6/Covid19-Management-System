/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.VaccinationDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Vaccination;
import service.VaccineInterface;

/**
 *
 * @author Admin
 */
public class VaccineImpl extends UnicastRemoteObject implements VaccineInterface{
    
    public VaccineImpl() throws RemoteException{
        super();
    }
    
    public VaccinationDao dao = new VaccinationDao(); 

    @Override
    public String vaccineRegister(Vaccination vac) throws RemoteException {
    
        return dao.vaccinationRegistry(vac);
    }

    @Override
    public String vaccineUpdate(Vaccination vac) throws RemoteException {
   
        return dao.vaccinationUpdate(vac);
    }

    @Override
    public String vaccineDeleteRecord(Vaccination vac) throws RemoteException {
  
        return dao.vaccinationDelete(vac);
    }

    @Override
    public List<Vaccination> getVaccinatedRecord() throws RemoteException {
    
        return dao.allVaccinatedCitizen();
    }

    @Override
    public Vaccination getVaccinetedCitezById(Vaccination vac) throws RemoteException {

        return dao.getVaccinatedById(vac);
    }
    
}
