package com.practice.exceptionhandling;
/*
 * There is only one situation, where finally block won't be executed
 * is wherever we are using "System.exit(0)"
 * finally block won't be executed because
 * JVM itself will be shut-down*/

public class Demo2 {
    public static void main(String[] args) {
        try {
            System.out.println("inside try bock");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("inside catch block");
        } finally {
            System.out.println("inside finally block");
        }
    }
}
