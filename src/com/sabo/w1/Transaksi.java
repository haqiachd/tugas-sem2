package com.sabo.w1;

/**
 * Class Transaksi digunakan untuk melakukan transaksi penjualan maupun pembelian,
 * saat melakukan proses transaksi class akan memanggil object dari class Menu atau Bahan
 * yang digunakan untuk mendapatkan data dari bahan atau menu yang akan dibeli.
 *
 * @author Kelompok C2
 */
public class Transaksi {

    // untuk melakukan transaksi penjualan
    public void transaksiJual(Menu menu, int jumlah){
        var harga = menu.getHarga() * jumlah;
        System.out.printf("Pembeli memesan %d %s dengan harga %d.\n", jumlah, menu.getName(), harga);
    }

    // untuk melakukan transaksi pembelian
    public void transaksiBeli(Bahan bahan, int jumlah){
        var harga = bahan.getHarga() * jumlah;
        System.out.printf("Karyawan memesan %d %s dengan harga %d.\n", jumlah, bahan.getName(), harga);
    }
}
