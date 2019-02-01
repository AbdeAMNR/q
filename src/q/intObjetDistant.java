/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import org.w3c.dom.Document;

/**
 *
 * @author amnrLaptop
 */
public interface intObjetDistant  extends Remote {
    public ArrayList<Vehicule> vehDisponible() throws RemoteException;
    public ArrayList<Doc> invalidDocs() throws RemoteException;
}

