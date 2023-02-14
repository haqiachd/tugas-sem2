package com.wsibd.w2;

import java.util.Scanner;

public class Tugas41 {

    public static void main(String[] args) {
        String name;
        int h1, h2, h3, h4, h5, ttl;
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("|           Kharisma Agung Plaza ( KAP )");
        System.out.println("|             Promo Belanja Berhadiah");
        System.out.println("|        Khusus Pembelian 5 Barang Pertama");
        System.out.println("|       Dengan harga minimum Rp 10000,00");
        System.out.println("|-------------------------------------------------------");
        System.out.print("| Masukan nama pembeli : "); name = scan.nextLine();
        System.out.println("| ");
        System.out.print("| Masukan harga barang ke-1 : "); h1 = scan.nextInt();
        System.out.print("| Masukan harga barang ke-2 : "); h2 = scan.nextInt();
        System.out.print("| Masukan harga barang ke-3 : "); h3 = scan.nextInt();
        System.out.print("| Masukan harga barang ke-4 : "); h4 = scan.nextInt();
        System.out.print("| Masukan harga barang ke-5 : "); h5 = scan.nextInt();
        ttl = (h1 + h2 + h3 + h4 + h5);
        System.out.println("| Total harga pembelian atas nama " + name + " adalah Rp " + ttl);
        System.out.println("| ");
        if(ttl >= 1000){
            System.out.println("| Selamat.....");
            System.out.println("| Anda mendapat hadian 1 buah mig cantik");
            System.out.println("| ");
        }
        System.out.println("|----------------------------------------------------------");
        System.out.println("|                          Terima kasih");
        System.out.println("|        Anda sudah berbelanja di Kharisma Agung Plaza");
        System.out.println("|----------------------------------------------------------");
    }
}
