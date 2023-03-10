package com.sabo.w5;

public class Makanan extends Menu{

    public Makanan(String nama, int harga){
        super(nama, harga);
    }

    @Override
    public void showInfo(){
        System.out.printf(
                "Nama Makanan : %s\nHarga %s : Rp. %,d\n\n",
                super.getNama(), super.getNama(), super.getHarga()
        );
    }
}
