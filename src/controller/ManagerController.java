/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LoginModel;
import model.ManajerModel;
import model.TambahManajerModel;
import model.TambahOutletModel;
import view.LoginView;
import view.HomeManagerView;
import view.TambahAkunView;
import view.TambahOutletView;


/**
 *
 * @author World
 */
public class ManagerController {

    model.ManajerModel theModel;
    view.HomeManagerView theView;

    public ManagerController(ManajerModel theModel, HomeManagerView theView) {
        this.theModel = theModel;
        this.theView = theView;
        theView.logout(new logout());
        theView.admin(new admin());
    }

    private class logout implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                LoginView lg = new LoginView();
                theView.dispose();
                lg.setVisible(true);
                LoginModel theModel = new LoginModel();
                LoginController theController = new LoginController(theModel, lg);
            } catch (SQLException ex) {
                Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class admin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                TambahAkunView a = new TambahAkunView();
                theView.dispose();
                a.setVisible(true);
                TambahManajerModel theModel = new TambahManajerModel() {

                };
                TambahMenejerController theController = new TambahMenejerController(theModel, a);
            } catch (SQLException ex) {
                Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
    private class outlet implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                TambahOutletView a = new TambahOutletView();
                theView.dispose();
                a.setVisible(true);
                TambahOutletModel theModel = new TambahOutletModel() {

                };
                TambahOutletController theController = new TambahOutletController(theModel, a);
            } catch (SQLException ex) {
                Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
}
