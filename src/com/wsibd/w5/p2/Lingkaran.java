package com.wsibd.w5.p2;

import com.sabo.w5.Menu;

public class Lingkaran extends BangunDatar{

    int r;

    public Lingkaran(int r){
        this.r = r;
    }

    @Override
    public float luas(){
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
}
