package com.wsibd.w5.tugas;

public class Tugas3 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeNoise();
        dog.makeNoise();

        Animal animalDog = new Dog();
        animalDog.makeNoise();

        if(animal instanceof Animal){
            System.out.println("animal is Animal");
        }
        if (dog instanceof Animal){
            System.out.println("dog is Animal");
        }
        if(animalDog instanceof Animal){
            System.out.println("animaldog is Animal");
        }
        if (animal instanceof Dog){
            System.out.println("animal is Dog");
        }



    }
}
