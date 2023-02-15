package com.wsibd.w2;

public class Person {

    private String name;

    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){
        this(null, 0);
    }

    public String getNama(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    private String fName = "Lisa",
                         lName = "Palombo",
                         stusStatus = "Active";
    private int id = 123456789;

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("ID : " + person.id);
        System.out.println("First name : " + person.fName);
        System.out.println("Last name : " + person.lName);
        System.out.println("Status : " + person.stusStatus);

    }
}
