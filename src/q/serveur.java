/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author amnrLaptop
 */
public class serveur {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ObjetDistant obj = new ObjetDistant();
            Naming.rebind("Hello", obj);
            System.out.println("Server ready");
        } catch (RemoteException | MalformedURLException ex) {
            System.out.println("Erreur : " + ex.toString());
        }
    }
}
