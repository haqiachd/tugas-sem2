package com.wsibd.w4;

public class InsertionSort {

    /**
     * Pertama-tama method akan mendeklarasikan 2 variabel baru dengan nama key dan j
     * yang memiiki tipe data integer. Kemudian method akan melakukan perulangan dari
     * index ke-1 sampai index terakhir dari array arr pada parameter. Didalam blok
     * statement for method akan menginisialisasi nilai dari variabel key dengan nilai
     * dari array arr pada index ke i. dan menginisialisasi nilai dari variabel j dengan
     * nilai dari variabel i pada looping yang dikurangi dengan 1.
     *
     * Kemudian method akan melakukan while loop jika nilai dari variabel j lebih besar dari
     * sama dengan 0 dan nilai array pada index ke j lebih besar dari nilai variabel key
     * Didalam blok statement while method akan menginisialisasi ulang nilai dari array
     * arr pada index ke j ditambah dengan 1 dengan nilai array arr pada index ke j. Setelah
     * blok statement while method akan menginisialisasi ulang nilai dari array arr pada index
     * ke j ditambah dengan 1 dengan nilai dari variabel key.
     *
     * @param arr array yang akan diurutkan
     */
    public static void insertionSort(int arr[]) {

        int key, j;
        for (var i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int arr[] = {13, 6, 30, 12, 4, 20, 15};

        System.out.println("Array Before Insertion Sort");
        for(var i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        insertionSort(arr);

        System.out.println("\n\nArray After Insertion Sort");
        for (var i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
