/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author World
 */
public abstract class baseModel {
    public connection con;
    
    public baseModel() throws SQLException{
        this.con = new connection("postgres", "franklampard08", "macarina");
    }
    
    public boolean save (String query) throws SQLException{
        try {
            con.execute(query);
            return true;
            }
        catch (Exception e){
            return false;
        }
    }

protected boolean update(String query) throws SQLException {
        try {
            con.execute(query);
            return true;
        } catch (Exception e) {
            return false;

        }
    
    }

 public boolean delete(String query) throws SQLException {
        try {
            con.execute(query);
            return true;
        } catch (Exception e) {
            return false;
        }
 }

}
