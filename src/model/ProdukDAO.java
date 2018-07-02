/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author World
 */
public class ProdukDAO extends baseModel {

    public ProdukDAO() throws SQLException {
        super();
    }

    public ArrayList<Produk> getAllProduk() throws SQLException, ParseException {
        ArrayList<Produk> a = new ArrayList<>();
        String sql = "SELECT * FROM produk";
        ResultSet rs = this.con.getResult(sql);
        while (rs.next()) {
            Produk p = new Produk();
            p.setIdProduk(rs.getInt("id_produk"));
            p.setNamaProduk(rs.getString("nama_produk"));
            p.setHarga(this.parse(rs.getString("harga"),Locale.US).doubleValue());
            a.add(p);
        }
        return a;
    }

    public BigDecimal parse(final String amount, final Locale locale) throws ParseException {
        final NumberFormat format = NumberFormat.getNumberInstance(locale);
        if (format instanceof DecimalFormat) {
            ((DecimalFormat) format).setParseBigDecimal(true);
        }
        return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]", ""));
    }

}
