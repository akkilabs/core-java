package com.practice.exceptionhandling;

/*
 * DefaultExceptionHandler handles only one Exception object
 * at a time and that is most recently raised Exception (NPE)
 */

public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println(10 / 2);
        } finally {
            String s = null;
            System.out.println(s.length());
        }
    }
}
