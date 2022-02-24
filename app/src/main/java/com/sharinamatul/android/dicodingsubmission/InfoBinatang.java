package com.sharinamatul.android.dicodingsubmission;

public class InfoBinatang {
    private String namaBinatang, deskripsi;
    private int idFotoBinatang, resourceNamaBinatang, resourceDeskripsi;

    public InfoBinatang(String namaBinatang, String deskripsi, int idFotoBinatang){
        this.namaBinatang = namaBinatang;
        this.deskripsi = deskripsi;
        this.idFotoBinatang = idFotoBinatang;
    }

    public InfoBinatang(int resourceNamaBinatang, int resourceDeskripsi, int idFotoBinatang){
        this.resourceNamaBinatang = resourceNamaBinatang;
        this.resourceDeskripsi = resourceDeskripsi;
        this.idFotoBinatang = idFotoBinatang;
    }
    public String getStringNamaBinatang() {
        return namaBinatang;
    }

    public String getStringDeskripsi() {
        return deskripsi;
    }

    public int getIdFotoBinatang() {
        return idFotoBinatang;
    }

    public int getResourceNamaBinatang(){ return resourceNamaBinatang; }

    public int getResourceDeskripsi(){ return resourceDeskripsi; }
}
