package com.sabo.w3;

public class Main {

    public static void main(String[] args) {

        var karyawan1 = new Karyawan("KY001", "Habib Dwi", 19, "Jakarta");
        System.out.println("-----Karyawan 1-----");
        System.out.println("ID Karyawan : " + karyawan1.getIdKaryawan());
        System.out.println("Nama : " + karyawan1.getNama());
        System.out.println("Umur : " + karyawan1.getUmur());
        System.out.println("Alamat : " + karyawan1.getAlamat());

        var karyawan2 = new Karyawan();
        System.out.println("\n-----Karyawan 2-----");
        karyawan2.setIdKaryawan("KY002");
        karyawan2.setNama("David Nila");
        karyawan2.setUmur(20);
        karyawan2.setAlamat("Bekasi");
        System.out.println("ID Karyawan : " + karyawan2.getIdKaryawan());
        System.out.println("Nama : " + karyawan2.getNama());
        System.out.println("Umur : " + karyawan2.getUmur());
        System.out.println("Alamat : " + karyawan2.getAlamat());

    }
}
