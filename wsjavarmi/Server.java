/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsjavarmi;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Rowshni - 15301082
 */
public class Server extends UnicastRemoteObject implements Interface
{
    public Server() throws RemoteException{
    
    }
    
    @Override 
    public void show() throws RemoteException{
        System.out.print("24 Degree Celcius");
    }
    
    public static void main(String [] args) throws RemoteException{
        try{
            Registry reg = LocateRegistry.createRegistry(9999);
            reg.rebind("hi server", new Server());
            System.out.println("Server is ready");
        }
        catch(RemoteException e)
        {
          System.out.println("exception"+e);
        }
    }
}
