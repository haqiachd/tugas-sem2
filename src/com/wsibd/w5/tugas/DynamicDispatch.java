package com.wsibd.w5.tugas;

class A{ // super class
    void callthis(){
        System.out.println("Inside Class A's Method!");
    }
}

/**
 * Subclass dari class A
 */
class B extends A{
    /**
     * Override method dari class callthis() pada class A
     */
    @Override
    void callthis(){
        System.out.println("Inside Class B's Method!");
    }
}

/**
 * Subclass dari class B
 */
class C extends B{

    /**
     * Override method dari class callthis() pada class A
     */
    @Override
    void callthis(){
        System.out.println("Inside Class C's Method!");
    }
}

public class DynamicDispatch {

    public static void main(String[] args) {

        var a = new A();
        var b = new B();
        var c = new C();

        A ref;
        ref = b;
        ref.callthis();

        ref = c;
        ref.callthis();

        ref = a;
        ref.callthis();

    }
}
