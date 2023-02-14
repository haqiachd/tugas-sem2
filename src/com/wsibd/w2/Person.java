package com.wsibd.w2;

public class Person {

    private String name;

    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getNama(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    private static String fName = "Lisa",
                         lName = "Palombo",
                         stusStatus = "Active";
    private static int id = 123456789;

    public static void main(String[] args) {

        System.out.println("ID : " + id);
        System.out.println("First name : " + fName);
        System.out.println("Last name : " + lName);
        System.out.println("Status : " + stusStatus);

    }
}
