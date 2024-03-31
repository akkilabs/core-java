package com.practice.oops.pack2;

import com.practice.oops.pack1.A;

public class C extends A {
    public static void main(String[] args) {
        /*
        A a = new A();
        a.m1(); // CErr: 'm1()' has protected access in 'com.practice.oops.pack1.A'

        A a1 = new C();
        a1.m1(); // CErr: 'm1()' has protected access in 'com.practice.oops.pack1.A'
        */

        C c = new C();
        c.m1();
    }

}
