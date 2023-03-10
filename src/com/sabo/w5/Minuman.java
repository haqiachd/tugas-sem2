package com.sabo.w5;

public class Minuman extends Menu{

    public Minuman(String nama, int harga){
        super(nama, harga);
    }

    @Override
    public void showInfo(){
        System.out.printf(
                "Nama Minuman : %s\nHarga %s : Rp. %,d\n\n",
                super.getNama(), super.getNama(), super.getHarga()
        );
    }
}
