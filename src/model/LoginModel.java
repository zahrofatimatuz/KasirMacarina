/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.LoginController;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author World
 */
public class LoginModel {

    private connection con;
    private baseModel base;

    public LoginModel() throws SQLException {
        con = new connection("postgres", "faza16!", "macarina") {
            @Override
            public void execute(String sql) throws SQLException {

            }
        };
    }

    public int lvlLogin(String username, String password) throws SQLException {
        int level = 0;
        String query = "SELECT level FROM akun where username = '" + username + "' and password = '" + password + "'";
        ResultSet rs = con.getResult(query);
        rs.next();
        level = Integer.valueOf(rs.getString(1));
        return level;
    }

    public int login(String username, String password) throws SQLException {
        int result = 0;

        String query = "SELECT * FROM akun where username = '" + username + "' and password = '" + password + "'";
        ResultSet rs = con.getResult(query);
        rs.last();
        result = rs.getRow();
        if (result == 1) {
            LoginController.setUserLogin(rs.getString("id_akun"));
        }
        return result;

    }
}
