/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.CitizenDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Citizen;
import service.CitizenInterface;

/**
 *
 * @author Admin
 */
public class CitizenImpl extends UnicastRemoteObject implements CitizenInterface{
    
    public CitizenImpl() throws RemoteException{
        super();
    }
    
    public CitizenDao dao = new CitizenDao();

    @Override
    public String registerCitizen(Citizen citizen) throws RemoteException {
       
      return dao.registerCitizen(citizen);
    }

    @Override
    public String updateCitizen(Citizen citizen) throws RemoteException {
      return dao.updateCitizen(citizen);
    }

    @Override
    public String deleteCitizen(Citizen citizen) throws RemoteException {
    
        return dao.deleteCitizen(citizen);
    }

    @Override
    public List<Citizen> getAllCitizen() throws RemoteException {
     
        return dao.allCitizen();
    }

    @Override
    public Citizen getCitizenById(Citizen citizen) throws RemoteException {
     
        return dao.getCitizenById(citizen);
    }
   
    
}
