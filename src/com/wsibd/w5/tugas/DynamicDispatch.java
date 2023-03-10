package com.wsibd.w5.tugas;

class A{
    void callthis(){
        System.out.println("Inside Class A's Method!");
    }
}
class B extends A{
    void callthis(){
        System.out.println("Inside Class B's Method!");
    }
}
class C extends B{
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
