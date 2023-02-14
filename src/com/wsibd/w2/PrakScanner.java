package com.wsibd.w2;

import java.util.Scanner;

public class PrakScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah, nilai1, nilai2;

        System.out.print("Masukan nilai 1 : ");
        nilai1 = scan.nextInt();
        System.out.print("Masukan nilai 2 : ");
        nilai2 = scan.nextInt();

        jumlah = nilai1 + nilai2;
        System.out.println("Jumlah : " + jumlah);
    }
}
