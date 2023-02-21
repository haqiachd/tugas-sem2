package com.wsibd.w3;

import java.util.Scanner;

public class Tugas51 {

    public static void main(String[] args) {

        int bil1, bil2, pil;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Bilangan 1 : ");
        bil1 = scan.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = scan.nextInt();
        System.out.println("Pilihan Urutan : ");
        System.out.println(" 1. Genap");
        System.out.println(" 2. Ganjil");
        System.out.print("Masukan Kode [1/2] : ");
        pil = scan.nextInt();

        // melakukan perulangan dari bil1 sampai bil1
        for(int i = bil1; i <= bil2; i++){
            // mengecek apakah bilangan genap
            if((i % 2) == 0){
                // jika yang dipilih opsi genap maka akan ditampilkan
                if(pil == 1){
                    System.out.print(i + " ");
                }
            }
            // jika bilangan adalah angka ganjil
            else{
                // jika yang dipilih opsi ganjil maka akan ditampilkan
                if(pil == 2){
                    System.out.print(i + " ");
                }
            }
        }


    }
}
