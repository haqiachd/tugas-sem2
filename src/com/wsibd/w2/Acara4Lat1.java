package com.wsibd.w2;

import java.util.Scanner;

public class Acara4Lat1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String grade;
        int nilai;

        System.out.print("Inputkan nilai : ");
        nilai = scan.nextInt();

        if(nilai >= 90){
            grade = "A";
        }else if(nilai >= 80){
            grade = "B+";
        }else if(nilai >= 70){
            grade = "B";
        }else if(nilai >= 60){
            grade = "C+";
        }else if(nilai >= 50){
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        }else {
            grade = "E";
        }

        System.out.println("Grade : " + grade);
    }
}
