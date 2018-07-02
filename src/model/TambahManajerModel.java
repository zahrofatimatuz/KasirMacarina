/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author World
 */
public class TambahManajerModel extends baseModel {

    connection con;

    public TambahManajerModel() throws SQLException {
        super();
        this.con = new connection("postgres", "franklampard08", "macarina");
    }

    public boolean save(String query) throws SQLException {
        String queri = "INSERT INTO akun( id_akun, username, password, alamat, level) VALUES ( " + query + " )";
        System.out.println(queri);
        return super.save(queri);

    }

    public boolean update(String query) throws SQLException {
        String queri = "update akun set " + query;
        return super.update(queri);
    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"id_akun", "username", "password", "level", "alamat"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select * from akun";
//        System.out.println(sql);

        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = con.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }
}
