package com.sharinamatul.android.dicodingsubmission;

public class InfoBinatang {
    private int idFotoBinatang, resourceNamaBinatang, resourceDeskripsi;

    public InfoBinatang(int resourceNamaBinatang, int resourceDeskripsi, int idFotoBinatang){
        this.resourceNamaBinatang = resourceNamaBinatang;
        this.resourceDeskripsi = resourceDeskripsi;
        this.idFotoBinatang = idFotoBinatang;
    }

    public int getIdFotoBinatang() {
        return idFotoBinatang;
    }

    public int getResourceNamaBinatang(){ return resourceNamaBinatang; }

    public int getResourceDeskripsi(){ return resourceDeskripsi; }
}
