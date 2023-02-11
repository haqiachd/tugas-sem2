package com.sabo.w1;

/**
 * Main class dari project digunaakan untuk membuat object dari
 * class2 yang sebelumnya sudah dibuat.
 *
 * @author Kelompok C2
 */
public class Main {
    public static void main(String[] args) {

        // membuat object dari class Menu
        Menu menu1 = new Menu("Nasi Goreng", 12_000),
             menu2 = new Menu("Coffe Latte", 10_000);

        // membuat object dari class Bahan
        Bahan bahan1 = new Bahan("Saos", 2_000),
              bahan2 = new Bahan("Bubuk Kopi", 3_000);

        // mmebuat object dari class Transaksi
        var transaksi = new Transaksi();

        // memanggil method transaksi jual
        transaksi.transaksiJual(menu1, 2);
        transaksi.transaksiJual(menu2, 4);

        // memanggil method transaksi beli
        transaksi.transaksiBeli(bahan1, 3);
        transaksi.transaksiBeli(bahan2, 5);
    }
}
