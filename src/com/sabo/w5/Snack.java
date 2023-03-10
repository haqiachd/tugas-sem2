package com.sabo.w5;

public class Snack extends Menu{

    public Snack(String nama, int harga){
        super(nama, harga);
    }

    @Override
    public void showInfo(){
        System.out.printf(
                "Nama Snack : %s\nHarga %s : Rp. %,d\n\n",
                super.getNama(), super.getNama(), super.getHarga()
        );
    }

}
