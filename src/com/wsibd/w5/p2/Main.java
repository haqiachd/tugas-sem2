package com.wsibd.w5.p2;

import com.wsibd.w5.abstrak.B;

public class Main {

    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(6, 3);
        Lingkaran lingkaran = new Lingkaran(50);

        // call method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi : " + persegi.luas());
        System.out.println("Keliling persegi : " + persegi.keliling());
        System.out.println("Luas segitiga : " + segitiga.luas());
        System.out.println("Luas lingkaran : " + lingkaran.luas());
        System.out.println("Keliling lingkaran ; " + lingkaran.keliling());

    }
}
