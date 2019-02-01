/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q;

import java.sql.Date;

/**
 *
 * @author amnrLaptop
 */
public class Doc {

    private int idPapier;
    private String refPapier;
    private String typePapier;
    private Date finValidite;

    public Doc(int idPapier, String refPapier, String typePapier, Date finValidite) {
        this.idPapier = idPapier;
        this.refPapier = refPapier;
        this.typePapier = typePapier;
        this.finValidite = finValidite;
    }

}
