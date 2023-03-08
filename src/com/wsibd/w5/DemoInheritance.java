package com.wsibd.w5;

public class DemoInheritance {

    public static void main(String[] args) {
        var superOb = new ClassA();
        var subOb = new ClassB();

        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.tampilkanNilaiXY();;

        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.tampilkanNilaiXY();;

        subOb.z = 50;
        subOb.tampilkanJumlah();
    }
}
