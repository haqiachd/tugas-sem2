package com.sabo.w1;

/**
 * @author Kelompok C2
 */
public class Karyawan extends DataMaster{

    @Override
    public void tambahData(){
        System.out.println("Menambahkan data karyawan");
    }

    @Override
    public void editData(){
        System.out.println("Mengedit data karyawan");
    }

    @Override
    public void hapusData(){
        System.out.println("Menghapus data karyawan");
    }
}
