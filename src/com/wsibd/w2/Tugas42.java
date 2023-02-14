package com.wsibd.w2;

import java.util.Scanner;

public class Tugas42 {

    private static String getNama(int pil){
        switch (pil){
            case 1 : return "Soft drinks";
            case 2 : return "Mix juice";
            case 3 : return "Mescafe";
            case 4 : return "Soda milk";
            case 5 : return "Tea";
            default: return null;
        }
    }
    public static void main(String[] args) {
        String nama;
        int pil;
        Scanner scan = new Scanner(System.in);

        System.out.println("|               Cafe Ceria");
        System.out.println("|             Aneka Minuman");
        System.out.println("|---------------------------------------------");
        System.out.println("|   Special Menu : ");
        System.out.println("|    1. Soft drinks");
        System.out.println("|    2. Mix juice");
        System.out.println("|    3. Mescafe");
        System.out.println("|    4. Soda milk");
        System.out.println("|    5. Tea");
        System.out.println("|--------------------------------------------");
        System.out.print("| Masukan nama pembeli : "); nama = scan.nextLine();
        System.out.println("| ");
        System.out.print("| Silahkan masukan pilihan anda : "); pil = scan.nextInt();
        System.out.println("| Minuman yang dipesan adalah " + getNama(pil));
        System.out.println("| Pesanan akan segera kami antar");
        System.out.println("| Terimakasih telah berkunjung di Cafe Juice");
        System.out.println("|--------------------------------------------");

    }
}
