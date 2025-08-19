
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import service.implementation.CitizenImpl;
import service.implementation.VaccineImpl;



/**
 *
 * @author Admin
 */
public class Server{

    private CitizenImpl citizenImpl;
    
    private VaccineImpl vaccineImpl;
    
    public Server() throws RemoteException{
        this.citizenImpl = new CitizenImpl();
        this.vaccineImpl = new VaccineImpl();
    }
    public static void main(String[] args){
        try{
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        Registry registry = LocateRegistry.createRegistry(7000);
        registry.rebind("citizen", new CitizenImpl());
        registry.rebind("vaccine", new VaccineImpl());
        //registry.rebind("citizen", new Server().citizenImpl);
        //registry.rebind("vaccine", new Server().vaccineImpl);
            System.out.println("Server is running on port 7000");
        }  catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
