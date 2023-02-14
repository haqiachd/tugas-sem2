package com.wsibd.w2;

public class ManagingPeople {

    public static void main(String[] args) {

        Person p1 = new Person("Arial", 37),
               p2 = new Person("Joseph", 7);

        if(p1.getAge() == p2.getAge()){
            System.out.println(p1.getNama() + " Is the same age at " + p2.getNama());
        }else{
            System.out.println(p1.getNama() + " Is Not the same age at " + p2.getNama());
        }

    }
}
