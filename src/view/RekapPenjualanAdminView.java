package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Outlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author World
 */
public class RekapPenjualanAdminView extends javax.swing.JFrame {

    private Object[] header = {"ID pesanan", "ID Produk", "Nama Produk", "Qty", "Total Harga"};
    DefaultTableModel tableModel = new DefaultTableModel(null, header);

    public RekapPenjualanAdminView() {
        initComponents();
    }

    public JTable getTableRekapAdmin(JTable jTabelRekap) {
        return jTabelRekap;
    }

    public void tabelListener(MouseListener m) {
        jTabelRekap.addMouseListener(m);
    }

    public String getValueAt(int baris, int kolom) {
        return (String) this.jTabelRekap.getValueAt(baris, kolom);
    }

    public void setTabel(DefaultTableModel tabel) {
        this.jTabelRekap.setModel(tabel);
    }

    public int getSelectedRow() {
        return jTabelRekap.getSelectedRow();
    }

    public void btnHomeAdmin(boolean status) {
        this.btnHomeAdmin.setEnabled(status);
    }

    public void btnHomeAdmin(ActionListener a) {
        this.btnHomeAdmin.addActionListener(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelRekap = new javax.swing.JTable();
        btnHomeAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTabelRekap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "ID Pesanan", "ID Produk", "Nama Produk", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabelRekap);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 910, -1));

        btnHomeAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnHome.png"))); // NOI18N
        btnHomeAdmin.setBorder(null);
        btnHomeAdmin.setContentAreaFilled(false);
        btnHomeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/REKAP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAdminActionPerformed

    }//GEN-LAST:event_btnHomeAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RekapPenjualanAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RekapPenjualanAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RekapPenjualanAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RekapPenjualanAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RekapPenjualanAdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHomeAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelRekap;
    // End of variables declaration//GEN-END:variables
}
