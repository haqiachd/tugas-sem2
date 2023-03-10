package com.sabo.w5;

public class FlavouredCoffee extends Menu{

    public FlavouredCoffee(String nama, int harga){
        super(nama, harga);
    }

    @Override
    public void showInfo(){
        System.out.printf(
                "Nama Flavoured Coffee : %s\nHarga %s : Rp. %,dn\n\n",
                super.getNama(), super.getNama(), super.getHarga()
        );
    }
}
