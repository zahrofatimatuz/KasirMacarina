/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import view.*;

/**
 *
 * @author World
 */
public class TambahOutletController {

    model.TambahOutletModel theModel;
    view.TambahOutletView theView;
    ArrayList<Outlet> adminOutlet;

    public TambahOutletController(TambahOutletModel theModel, TambahOutletView theView) throws SQLException {
        this.theModel = theModel;
        this.theView = theView;

        theView.btnEdit(false);
        theView.btnEditListener(new edit());
        this.theView.addAdminList(adminOutlet);

//   theView.btnPilihListener(new TambahOutletController.pilih());
    }

    private class edit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int baris = theView.getSelectedRow();
                String id = theView.getIdOutlet();
                String namaOutlet = theView.getNamaOutlet();
                String alamatOutlet = theView.getTxtAlamatOutlet();
                String admin = theView.getListAdmin();
                theModel.update("nama_outlet = '" + namaOutlet + "',alamat_outlet = '" + alamatOutlet + "',admin_outlet = '" + adminOutlet + "',level=1 where id_akun = " + id);
                theView.setTabel(theModel.getTableModel());
                clear();
                theView.btnEdit(false);
                theView.btnTambah(true);
            } catch (SQLException ex) {
                Logger.getLogger(TambahMenejerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void clear() {
        theView.setNamaOutlet("");
        theView.setAlamatOutlet("");
    }

//        private class pilih implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            int baris = theView.getSelectedRow();
//            if (baris != -1) {
//
//                String id = theView.getValueAt(baris, 0);
//                String namaOutlet = theView.getValueAt(baris, 1);
//                String alamatOutlet = theView.getValueAt(baris, 2);
//                String admin = theView.getValueAt(baris, 4);
//
//                theView.setName(namaOutlet);
//                theView.setAlamatOutlet(alamatOutlet);
////                theView.setA(id);
////                theView.setAlamat(alamat);
//
////                theView.btnEdit(true);
////                theView.btnTambah(false);
//            }}
//        
}
