package q;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author amnrLaptop
 */
public class ObjetDistant extends UnicastRemoteObject implements intObjetDistant {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public ObjetDistant() throws RemoteException {
        super();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-L8670M4;databaseName=DB_Demandes;integratedSecurity=true;");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erreur " + ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    System.out.println("Erreur " + e.toString());
                }
            }
        }

    }

    @Override
    public ArrayList<Doc> invalidDocs() throws RemoteException {
        ArrayList<Doc> alDoc = new ArrayList<Doc>();
        try {
            ps = conn.prepareStatement("select * from Document");
            rs = ps.executeQuery();
            while (rs.next()) {
                Doc doc = new Doc(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4));
                alDoc.add(doc);
            }
        } catch (SQLException ex) {
            System.out.println("Erreur : " + ex.toString());
        }
        return alDoc;
    }

    @Override
    public ArrayList<Vehicule> vehDisponible() throws RemoteException {
        ArrayList<Vehicule> alVh = new ArrayList<Vehicule>();
        try {
            ps = conn.prepareStatement("select * from Vehicule");
            rs = ps.executeQuery();
            while (rs.next()) {
                Vehicule v = new Vehicule(rs.getInt(1), rs.getString(2), rs.getDate(3));
                alVh.add(v);
            }
        } catch (SQLException ex) {
            System.out.println("Erreur : " + ex.toString());
        }
        return alVh;
    }

}
