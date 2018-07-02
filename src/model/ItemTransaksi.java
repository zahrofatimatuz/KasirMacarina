/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author World
 */
public class ItemTransaksi {
    private double harga;
    
    private int qty;
    
    private long idProduk;

    public long getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(long idProduk) {
        this.idProduk = idProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
