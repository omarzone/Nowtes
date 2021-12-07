/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAONote;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;


/**
 *
 * @author PC GOOSE
 */
public  class DAOSettings extends DAOMain {

   

    public int modify(boolean isDarkThemeOn) throws SQLException {
        System.out.println("Hola estoy entrando a modify de DAOSettings");
        int numRows = 0;
        Connection con = getConnection();
        
        String orden = "UPDATE settings SET darktheme = " + isDarkThemeOn;
        Statement sentencia = con.createStatement();
        numRows = sentencia.executeUpdate(orden);
        sentencia.close();
        closeConnection(con);
        return numRows;
    }
    
    public boolean getTheme() throws SQLException {
        Connection con = getConnection();
        boolean isThemeDarkOn;
        ResultSet rs = null;
        
        String orden = "SELECT * FROM settings WHERE id = 1";
        try (Statement sentencia = con.createStatement()) {
             rs = sentencia.executeQuery(orden);
             if(rs.next()){
                isThemeDarkOn = rs.getBoolean("darktheme");
                 return isThemeDarkOn;
             }
        }
        return false;
    }

    @Override
    public int add(Object entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String condition) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modify(Object entity, String condition) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public ArrayList query(String condition) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
   
}
