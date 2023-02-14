package com.wsibd.w2;

class Book{
    int price;
    int pages;

    public void set(int price, int pages){
        this.price = price;
        this.pages = pages;
    }

    public void show(){
        System.out.println("Book information");
        System.out.println("book price : " + this.price);
        System.out.println("number of pages : " + this.pages);
    }
}
public class Buku {

    public static void main(String[] args) {
        Book book = new Book();
        book.set(60_000, 100);
        book.show();
    }
}
