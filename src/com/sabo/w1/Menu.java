package com.sabo.w1;

/**
 * Class Menu digunakan untuk menambahkan dan
 * mendapatkan data menu seperti nama dan harga
 *
 * @author Kelompok C2
 */
public class Menu {
    private String name;
    private int harga;
    public Menu(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }
    public String getName() {return this.name;}
    public int getHarga() {return harga;}
}
