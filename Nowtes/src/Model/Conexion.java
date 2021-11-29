/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC GOOSE
 */
public class Conexion {
    private final String BASE = "nowtes";
    private final String USER = "FredyDB";
    private final String PASSWORD = "Happynegra14&";
    private final String URL = "jdbc:mysql://localhost:3306/nowtes";
    private Connection con = null;
    
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return con;
    }
}
