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
public class Outlet {
    private int idOutlet;
    private String namaOutlet;
    private String alamatOutlet;
    private int idAmin;

    public int getIdOutlet() {
        return idOutlet;
    }

    public void setIdOutlet(int idOutlet) {
        this.idOutlet = idOutlet;
    }

    public String getNamaOutlet() {
        return namaOutlet;
    }

    public void setNamaOutlet(String namaOutlet) {
        this.namaOutlet = namaOutlet;
    }

    public String getAlamatOutlet() {
        return alamatOutlet;
    }

    public void setAlamatOutlet(String alamatOutlet) {
        this.alamatOutlet = alamatOutlet;
    }

    public int getIdAmin() {
        return idAmin;
    }

    public void setIdAmin(int idAmin) {
        this.idAmin = idAmin;
    }
}
