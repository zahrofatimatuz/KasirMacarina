/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author World
 */
public class OutletModel extends baseModel {

    connection con;

    public OutletModel() throws SQLException {
        super();
        this.con = new connection("postgres", "faza16!", "macarina");
        System.out.println("test outlet model");
    }

    
    public ArrayList<Outlet> getAllAdmin() throws SQLException, ParseException {
        ArrayList<Outlet> a = new ArrayList<>();
        String sql = "SELECT username FROM akun";
        ResultSet rs = this.con.getResult(sql);
        while (rs.next()) {
            Outlet o = new Outlet();
            o.setIdOutlet(rs.getInt("id_outlet"));
            o.setNamaOutlet(rs.getString("nama_outlet"));
            o.setAlamatOutlet(sql);
            a.add(o);
        }
        return a;
    }
    
    
}
