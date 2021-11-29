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
    private final String BASE = "sql5454888";
    private final String USER = "sql5454888";
    private final String PASSWORD = "YrD34AYsft";
    private final String URL = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5454888";
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
