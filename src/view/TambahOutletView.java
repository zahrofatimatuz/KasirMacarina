/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OutletController;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author FAZA
 */
public class TambahOutletView extends javax.swing.JFrame {

    private Object[] header = {"ID Outlet", "Nama Outlet", "Alamat Outlet", "Admin"};
    DefaultTableModel tableModel = new DefaultTableModel(null, header);

    /**
     * Creates new form daftarOutlet
     */
    public TambahOutletView() {
        initComponents();
    }

    public String getIdOutlet() {
        return txtId.getText();
    }

        public void setIdOutlet(String isi) {
        this.txtId.setText(isi);
    }
    
    public String getIdAkun() {
        return txtId.getText();
    }
    

    public String getNamaOutlet() {
        return txtNamaOutlet.getText();
    }

    public void setNamaOutlet(String isi) {
        this.txtNamaOutlet.setText(isi);
    }

    public String getAlamatOutlet() {
        return txtAlamatOutlet.getText();
    }

    public void setAlamatOutlet(String isi) {
        this.txtAlamatOutlet.setText(isi);
    }
    
    public String getAdminOutlet() {
        return txtAdminOutlet.getText();
    }

    public void setAdminOutlet(String isi) {
        this.txtAdminOutlet.setText(isi);
    }

//    public int getAdminSelected() {
//        return cbxAdminOutlet.getSelectedIndex();
//    }
//
//    public String getListAdmin() {
//        return (String) cbxAdminOutlet.getSelectedItem();
//    }
//
//    public void setListAdmin(String[] listJenis) {
//        for (String a : listJenis) {
//            this.cbxAdminOutlet.addItem(a);
//        }
//    }

    public void btnTambah(boolean status) {
        this.btnTambah.setEnabled(status);
    }

    public void btnTambahOutlet(ActionListener a) {
        this.btnTambah.addActionListener(a);
    }

    public void btnEdit(boolean status) {
        this.btnEdit.setEnabled(status);
    }

    public void btnEditListener(ActionListener a) {
        this.btnEdit.addActionListener(a);
    }

    public void btnKembali(ActionListener a) {
        btnKembali.addActionListener(a);
    }

    public JTable getTableOutlet(JTable tableOutlet) {
        return tableOutlet;
    }

    public void addTableModel(DefaultTableModel model) {
        tabelOutlet.setModel(model);
    }

    public void tabelListener(MouseListener m) {
        tabelOutlet.addMouseListener(m);
    }

    public void btnPilihListener(ActionListener a) {
        this.btnPilih.addActionListener(a);
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabelOutlet.setModel(tabel);
    }

    public int getSelectedRow() {
        return tabelOutlet.getSelectedRow();
    }

    public String getValueAt(int baris, int kolom) {
        return (String) this.tabelOutlet.getValueAt(baris, kolom);
    }
//String idAdmin = Integer.toString(getid)
//    public void addAdminList(ArrayList<Outlet> listAdmin) {
//        String idAdmin = Integer.toString();
//        System.out.println("test list Admin");
//        DefaultComboBoxModel<String> mdl = new DefaultComboBoxModel<>();
//        for (int i = 0; i < listAdmin.size(); i++) {
//            mdl.addElement(listAdmin.get(i).getIdAmin());
//        }
//        cbxAdminOutlet.setModel(mdl);
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambah = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtNamaOutlet = new javax.swing.JTextField();
        txtAlamatOutlet = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelOutlet = new javax.swing.JTable();
        Frame = new javax.swing.JLabel();
        btnPilih = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        txtAdminOutlet = new javax.swing.JTextField();
        FRAME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnTambah.png"))); // NOI18N
        btnTambah.setBorder(null);
        btnTambah.setContentAreaFilled(false);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 120, 50));

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnKembali.png"))); // NOI18N
        btnKembali.setBorder(null);
        btnKembali.setContentAreaFilled(false);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 140, 50));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEdit.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 120, 50));

        txtNamaOutlet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNamaOutlet.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(txtNamaOutlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 183, 180, 30));

        txtAlamatOutlet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAlamatOutlet.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(txtAlamatOutlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 233, 180, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Outlet", "Nama Outlet", "Alamat Outlet", "Admin"
            }
        ));
        jScrollPane2.setViewportView(tabelOutlet);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 740, 510));
        getContentPane().add(Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        btnPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnPilih.png"))); // NOI18N
        btnPilih.setToolTipText("");
        btnPilih.setBorder(null);
        btnPilih.setBorderPainted(false);
        btnPilih.setContentAreaFilled(false);
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });
        getContentPane().add(btnPilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        txtAdminOutlet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAdminOutlet.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(txtAdminOutlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 180, 30));

        FRAME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OUTLET.png"))); // NOI18N
        getContentPane().add(FRAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

    }//GEN-LAST:event_btnTambahActionPerformed

    public void addTambahListener(ActionListener listener) {
        btnTambah.addActionListener(listener);
    }

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
     
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FRAME;
    private javax.swing.JLabel Frame;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnTambah;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelOutlet;
    private javax.swing.JTextField txtAdminOutlet;
    private javax.swing.JTextField txtAlamatOutlet;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNamaOutlet;
    // End of variables declaration//GEN-END:variables

    private static class tambahOutlet {

        private static void addActionListener(ActionListener a) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public tambahOutlet() {
        }
    }
}
