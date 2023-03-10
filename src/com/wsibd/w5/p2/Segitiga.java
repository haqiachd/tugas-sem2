package com.wsibd.w5.p2;

public class Segitiga extends BangunDatar{

    int alas, tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas(){
        return this.alas * this.tinggi;
    }
}
