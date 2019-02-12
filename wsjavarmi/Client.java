/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsjavarmi;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//import java.util.Scanner;

/**
 *
 * @author Rowshni - 15301082
 */
public class Client {
    public static void main(String[] args) throws RemoteException{
        Client c = new Client();
        c.connectRemote();
    }
    
    private void connectRemote() throws RemoteException{
        try{
            //Scanner sc = new Scanner (System.in);
            Registry reg = LocateRegistry.getRegistry("localhost",9999);//use ip for different machine
            Interface ad = (Interface)reg.lookup("Connected to Server");
            //System.out.println("Temparature = ");
            ad.show();
        }
        catch(NotBoundException|RemoteException e){
            System.out.println("exception"+e);
        }
    
    }
    
}
