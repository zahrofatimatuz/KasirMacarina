/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.LoginController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author World
 */
public class PemesananModel extends baseModel {

    connection con;
    String username;

    public PemesananModel() throws SQLException {
        super();
        this.con = new connection("postgres", "franklampard08", "macarina");
        System.out.println("tes");
        //this.username = LoginController.getUserLogin();

    }

    
    public boolean saveTransaksi(String namaPemesan,ArrayList<ItemTransaksi> list) throws SQLException {
        String sqloutlet = "SELECT * FROM outlet WHERE id_akun = "+LoginController.getUserLogin();
        ResultSet rs = con.getResult(sqloutlet);
        rs.next();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate now = LocalDate.now();
        
        String queri = "INSERT INTO pesanan( nama_pesanan, tanggal_pesanan, id_outlet) VALUES ( '" + namaPemesan + "','"+df.format(now)+"',"+rs.getString("id_outlet")+" )";
        super.save(queri);
        queri ="SELECT * FROM pesanan ORDER BY id_pesanan DESC";
        rs = con.getResult(queri);
        rs.next();
        String idPesanan = rs.getString("id_pesanan");
        for (int i = 0; i < list.size(); i++) {
            queri = "INSERT INTO detail_pesanan( id_pesanan, id_produk, jumlah, harga) VALUES ( " + idPesanan + ","+list.get(i).getIdProduk()+","
                    +list.get(i).getQty()+","+list.get(i).getHarga()+" )";
            super.save(queri);
        }
        
        return true;
    }
    
    
    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"id_pesanan", "nama pemesan", "jumlah", "jenis_pesanan", "harga"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select p.id_pesanan, p.nama_pemesan, p.jumlah, j.jenis, j.harga\n"
                + "from pemesanan p join jenis j on j.id_jenis=p.id_jenis ";

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

    public String[] listBarang() throws SQLException {
        String query = "SELECT jenis FROM jenis";
        ResultSet rs = con.getResult(query);
        rs.last();
        String jenis[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            jenis[a] = rs.getString("jenis");
            a++;
        }
        a = 0;
        return jenis;
    }

}
