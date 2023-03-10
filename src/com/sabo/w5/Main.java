package com.sabo.w5;

public class Main {

    public static void main(String[] args) {
        Makanan makanan = new Makanan("Nasi Goreng", 12_000);
        makanan.showInfo();

        Minuman minuman = new Minuman("Jus Jeruk", 3_000);
        minuman.showInfo();

        Snack snack = new Snack("Kentang Goreng", 8_000);
        snack.showInfo();

        FlavouredCoffee flavoured = new FlavouredCoffee("Vanilla Latte", 5_000);
        flavoured.showInfo();

        OriginalCoffee original = new OriginalCoffee("Cappucino", 7_000);
        original.showInfo();
    }
}
