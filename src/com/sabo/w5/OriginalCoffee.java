package com.sabo.w5;

public class OriginalCoffee extends Menu{

    public OriginalCoffee(String nama, int harga){
        super(nama, harga);
    }

    @Override
    public void showInfo(){
        System.out.printf(
                "Nama Original Coffee : %s\nHarga %s : Rp. %,d\n\n",
                super.getNama(), super.getNama(), super.getHarga()
        );
    }
}
