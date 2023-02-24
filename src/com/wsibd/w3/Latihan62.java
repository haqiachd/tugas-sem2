package com.wsibd.w3;

import java.util.Scanner;

public class Latihan62 {

    public static void main(String[] args) {
        String[] array;
        Scanner input = new Scanner(System.in);
        int index;

        System.out.print("Masukan index array : ");
        index = input.nextInt();
        array = new String[index];

        for(int i = 0; i < index; i++){
            System.out.print("Masukan nilai array ke-[" + i + "] : ");
            array[i] = input.next();
        }

        System.out.println("\nNilai dari array");
        for(int i = 0; i < index; i++){
            System.out.printf("Nilai ke-[%d] : %s\n", i, array[i]);
        }
    }
}
