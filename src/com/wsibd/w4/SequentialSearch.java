package com.wsibd.w4;

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
        int index = -1;

        for(int i = 0; i < paramOne.length; i++){
            if(paramOne[i] == paramTwo){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Your Target does not exist in the array");
        }else{
            System.out.println("Your target integer is in index " + index + " of the array");
        }
    }

    public static void main(String[] args) {
        int[] exVarOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        sequentialSearch(exVarOne, target);
    }
}
