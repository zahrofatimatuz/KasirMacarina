package view;

import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author World
 */
public class HomeAdminView extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public HomeAdminView() {
        initComponents();
    }

    public void pesanListener(ActionListener a){
        this.btnPesan.addActionListener(a);
    }
    public void logoutListener(ActionListener a){
        this.btnLogout.addActionListener(a);
    }
    public void rekapPesananListener(ActionListener a){
        this.btnRekapPesanan.addActionListener(a);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRekapPesanan = new javax.swing.JButton();
        btnPesan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        Frame = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRekapPesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRekap.png"))); // NOI18N
        btnRekapPesanan.setBorder(null);
        btnRekapPesanan.setContentAreaFilled(false);
        getContentPane().add(btnRekapPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 290, 50));

        btnPesan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnPesanan.png"))); // NOI18N
        btnPesan.setBorder(null);
        btnPesan.setContentAreaFilled(false);
        getContentPane().add(btnPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 310, 40));

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnLogOut.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));
        getContentPane().add(Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HOME.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frame;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPesan;
    private javax.swing.JButton btnRekapPesanan;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


}
