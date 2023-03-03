package com.wsibd.w4;

import java.util.Scanner;

public class BubbleSort {

    /**
     * Pertama-tama method akan menginisialisasi nilai dari variabel n dengan panjang index dari array
     * arr pada paremeter. Kemudian membuat sebuah variabel baru dengan nama temp yang nilainya adalah 0
     * Kemudian method akan melakukan perulangan dari index ke 0 sampai index ke n, Didalam blok statement
     * for loop i method akan membuat sebuah perulangan for lagi yang akan melakukan perulangan dari index
     * ke 1 sampai index ke n dikurangi 1. Didalam for loop j method akan membuat sebuah if statement
     * yang digunakan untuk mengecek apakah nilai dari array arr pada index ke j dikurangi 1 kurang dari nilai
     * array pada index ke j. Jika hasilnya true maka nilai pada variabel temp akan di inisialisasi ulang
     * dengan nilai dari array pada index ke j dikurangi i, menginisialisasi array arr pada index ke j dikurang i 1
     * dengan nilai dari array pada index ke j. dan yang terakhir akan menginisialisasi ulang nilai dari arra j
     * pada index ke j dengan nilai pada variabel temp
     *
     * @param arr array yang akan di sort
     */
    public static void bubleSort(int[] arr){
        int n = arr.length;
        int temp = 0;

        System.out.println();
        for(int i = 0; i < n; i++){
//            System.out.println("-> "+i);
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
//            for (int p = 0; p < arr.length; p++) {
//                System.out.print(arr[p] + " ");
//            }
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.printf("Masukan nilai array index ke-%d : ", i);
            arr[i] = input.nextInt();
        }

        System.out.println("\nArray Before Bubble Sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        bubleSort(arr);
        System.out.println("\n\nArray After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//        Masukan nilai array index ke-0 : 32
//        Masukan nilai array index ke-1 : 16
//        Masukan nilai array index ke-2 : 8
//        Masukan nilai array index ke-3 : 25
//        Masukan nilai array index ke-4 : 13