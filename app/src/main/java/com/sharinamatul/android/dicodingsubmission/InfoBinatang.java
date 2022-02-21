package com.sharinamatul.android.dicodingsubmission;

public class InfoBinatang {
    String namaBinatang;
    String deskripsi;
    int idFotoBinatang;

    public InfoBinatang(String namaBinatang, String deskripsi, int idFotoBinatang){
        this.namaBinatang = namaBinatang;
        this.deskripsi = deskripsi;
        this.idFotoBinatang = idFotoBinatang;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getIdFotoBinatang() {
        return idFotoBinatang;
    }
}
