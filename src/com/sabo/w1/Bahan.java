package com.sabo.w1;

/**
 * Class Bahan digunakan untuk menambahkan dan
 * mendapatkan data bahan seperti nama dan harga
 *
 * @author Kelompok C2
 */
public class Bahan {
    private String name;
    private int harga;
    public Bahan(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }
    public String getName() {return this.name;}
    public int getHarga() {return harga;}
}
