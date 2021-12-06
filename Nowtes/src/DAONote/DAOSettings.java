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


/**
 *
 * @author PC GOOSE
 */
public  class DAOSettings extends DAOMain {

   

    public int modify(boolean isDarkThemeOn) throws SQLException {
        int numRows = 0;
        Connection con = getConnection();
        
        String orden = "UPDATE settings SET darktheme = " + isDarkThemeOn;
        System.out.println(orden);
        Statement sentencia = con.createStatement();
        numRows = sentencia.executeUpdate(orden);
        sentencia.close();
        closeConnection(con);
        return numRows;
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
    
   // + " WHERE id = " + 1
    
}
