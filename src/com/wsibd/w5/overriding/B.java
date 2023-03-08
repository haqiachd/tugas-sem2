package com.wsibd.w5.overriding;

public class B extends A{

    @Override
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar();
        System.out.println("Method milik class B dipanggil");
    }
}
