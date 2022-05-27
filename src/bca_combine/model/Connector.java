/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bca_combine.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ratino
 */
public class Connector {
    protected Connection koneksi;
    protected Statement stmt;

    public Connector(){
        
    }
    
    public void setStatement() {
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_bca_combine?autoReconnect=true&failOverReadonly=false&maxReconnects=1000", "root", "");
            stmt = koneksi.createStatement();
        }
       catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
