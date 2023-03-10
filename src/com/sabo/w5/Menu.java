package com.sabo.w5;

public abstract class Menu {

    private String nama;
    private int harga;

    public Menu(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return this.nama;
    }

    public int getHarga(){
        return this.harga;
    }

    public abstract void showInfo();

}
