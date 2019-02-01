/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q;

import java.util.Date;

/**
 *
 * @author AbdeAMNR
 */
public class Vehicule {

    private int idVeh;
    private String matricule;
    private Date DateAchat = new Date();

    public Vehicule(int idVeh, String matricule, Date DateAchat) {
        this.idVeh = idVeh;
        this.matricule = matricule;
        this.DateAchat = DateAchat;
    }

    public Vehicule(int idVeh, String matricule) {
        this.idVeh = idVeh;
        this.matricule = matricule;
        this.DateAchat = new Date();
    }

    @Override
    public String toString() {
        return "ID de vehicule : " + this.idVeh + " Matricule : " + this.matricule + " Acheté le : " + this.DateAchat;
    }

    //   @Override
    public boolean equalss(Object obj) {
        if (obj instanceof Vehicule) {
            //   Emission Em = new Emission();
            if (this.idVeh == ((Vehicule) obj).idVeh) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        boolean check = false;
        if (obj.getClass().equals(this.getClass())) {
            //   Emission Em = new Emission();
            if (this.idVeh == ((Vehicule) obj).idVeh) {
                check = true;
                return check;
            }
        }
        return check;
    }

}
