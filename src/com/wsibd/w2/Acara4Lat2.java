package com.wsibd.w2;

import java.util.Scanner;

public class Acara4Lat2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String lampu;

        System.out.print("Inputkan warna lampu : ");
        lampu = scan.nextLine();

        switch (lampu){
            case "merah":
                System.out.println("Lampu merah, Berhenti!"); break;
            case "kuning":
                System.out.println("Lampu kuning, Harap hati-hati!"); break;
            case "hijau" :
                System.out.println("Lampu hijau, Silahkan jalan!!"); break;
            default:
                System.out.println("warna lampu salah!");
        }


    }
}
