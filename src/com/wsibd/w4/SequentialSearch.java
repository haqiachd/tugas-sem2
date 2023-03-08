package com.wsibd.w4;

import java.util.Scanner;

public class SequentialSearch {

    /**
     * Pertama-tama method akan membuat sebuah variabel baru dengan nama index dengan inisialisasi nilai awal adalah
     * angka 1. Kemudian method akan membuat sebuah perulangan yang digunakan untuk membaca semua data yang ada di
     * dalam array yang diinputkan. Didalam blok statement for terdapat if statement untuk melakukan pengecekan
     * apakah nilai array saat ini sama dengan data yang dicari. Jika true maka nilai dari variabel index
     * akan di inisialisasi ulang dengan index saat ini dari array, dan perulangan akan berhenti. Namun jika tidak sama
     * maka perulangan akan terus berjalan sampai index terakhir dari array. Dibawah for loop terdapat if else statement
     * yang dgunakan untuk menampilkan pesan apakah data yang dicari ditemukan atau tidak didalam array.
     *
     * @param paramOne data array
     * @param paramTwo data yang akan dicari
     */
    public static void sequentialSearch(int[] paramOne, int paramTwo){
        var index = -1;

        // membaca semua data yang ada didalam array
        for(var i = 0; i < paramOne.length; i++){
            // cek apakah data dari array sama atau tidak dengan data yang dicari
            if(paramOne[i] == paramTwo){
                index = i;
                break;
            }
        }

        // menampilkan pesan output
        if(index == -1){
            System.out.println("Angka yang Anda cari tidak ditemukan!");
        }else{
            System.out.println("Angka yang Anda cari terdapat pada index ke-" + index + " pada array");
        }
    }

    public static void main(String[] args) {
        // inisialisasi
        Scanner input = new Scanner(System.in);
        int [] exVarOne = new int[10];
        int target;

        // menginputkan data array
        for(var i = 0; i < exVarOne.length; i++){
            System.out.print("Masukan nilai dari index ke-" + i + " : ");
            exVarOne[i] = input.nextInt();

        }

        // menginputkan data angka yang dicari
        System.out.print("\nMasukan angka yang dicari : ");
        target = input.nextInt();

        // mencari data angka yang dicari
        System.out.println();
        sequentialSearch(exVarOne, target);
    }
}
