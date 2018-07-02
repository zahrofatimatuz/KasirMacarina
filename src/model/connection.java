/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author World
 */
public class connection {
    private Connection con;
    private Statement stm;
    
    
    public connection (String username, String password, String db ) throws SQLException{
        
        String url = "jdbc:postgresql://localhost:5432/" + db;
        con = DriverManager.getConnection(url, username, password);
        stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);   
    }
    
   public void execute (String sql) throws SQLException{
       this.stm.executeUpdate(sql);
    }
    
    public ResultSet getResult(String sql) throws SQLException{
        return stm.executeQuery(sql);
    }
    
    public connection connection(){
        return (connection) con;
    }
}
