package com.sabo.w3;

public class Karyawan {

    private String idKaryawan, alamat;

    public String nama;

    protected int umur;

    public Karyawan(String idKaryawan, String nama, int umur, String alamat){
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public Karyawan(){
        this(null, null, 0, null);
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {return nama;}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
