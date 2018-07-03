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
public class RekapManagerModel {

    connection con;

    public RekapManagerModel() throws SQLException {
        super();
        this.con = new connection("postgres", "franklampard08", "macarina");

    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"ID Pesanan", "Tanggal Pesanan", "ID Outlet", "ID Produk", "Nama Produk", "Qty","Total Harga"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "SELECT ps.id_pesanan, ps.tanggal_pesanan, o.id_outlet, pd.id_produk, pd.nama_produk, dps.jumlah,(dps.harga * dps.jumlah) as total\n"
                + "FROM public.pesanan ps join public.detail_pesanan dps on dps.id_pesanan = ps.id_pesanan join public.produk pd\n"
                + "on dps.id_produk = pd.id_produk join public.outlet o on ps.id_outlet = o.id_outlet\n"
                + "ORDER BY id_pesanan ASC;";
//        System.out.println(sql);

        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = con.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[7];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }
}
