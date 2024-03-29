package com.practice.exceptionhandling;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    /*
     * when there is an exception raised in try block
     * and that exception is handled by corresponding catch block
     * then after that first finally block statements will be executed
     * after that only control comes back to catch block and executes remaining statements
     *
     *
     ** Once control comes out of try block it never go back to the try block **
     * */
    public static int m1() {
        try {
            System.out.println(10 / 0);
            return 777;
        } catch (ArithmeticException ae) {
            return 888;
        } finally {
            //return 999;
            System.out.println("Hello");
        }
    }
}
