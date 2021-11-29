/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAONote;

import Model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Note;

/**
 *
 * @author PC GOOSE
 */
public class DAONote extends Conexion{
    
        public void getData(Note nota){
         PreparedStatement ps = null;
         Connection con = (Connection)getConnection();
         ResultSet rs = null;
        
        String sql = "SELECT * FROM note WHERE id=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, "1");
            rs = ps.executeQuery();
            
            if(rs.next()){
                nota.setTitle(rs.getString("title"));
                nota.setDescription(rs.getString("description"));
                nota.setStatus(rs.getBoolean("status"));
                nota.setDate(String.valueOf(rs.getDate("date")));
                nota.setPriority(rs.getInt("priority"));
                nota.setAutoDelete(rs.getBoolean("autodelete"));
                
                //Posible error aqui
            } 
        }catch(SQLException e){
            System.err.println(e);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        }
        
}
