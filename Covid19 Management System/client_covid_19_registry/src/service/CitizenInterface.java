/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Citizen;

/**
 *
 * @author Admin
 */
public interface CitizenInterface extends Remote{
    //methos signature
    public String registerCitizen(Citizen citizen) throws RemoteException;
    public String updateCitizen(Citizen citizen) throws RemoteException;
    public String deleteCitizen(Citizen citizen) throws RemoteException;
    public List<Citizen> getAllCitizen() throws RemoteException;
    public Citizen getCitizenById(Citizen citizen) throws RemoteException;
    
}
