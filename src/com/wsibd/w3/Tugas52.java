package com.wsibd.w3;

public class Tugas52 {

    public static void main(String[] args) {

        System.out.println("         Do While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("===============================");
        // inisialisasi awal variabel i
        var i = 1;
        do{
            // menampilkan bilangan kelipatan
            System.out.print(i + " ");
            // menghitung bilangan kelipatan
            i = i * 2;
        }while(i <= 100); // batas bilangan kelipatan sampai dengan 100

    }
}
