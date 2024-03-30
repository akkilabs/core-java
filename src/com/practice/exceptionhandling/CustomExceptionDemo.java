package com.practice.exceptionhandling;

import java.util.Scanner;

/*
 * It is highly recommended that customized exceptions should be Unchecked
 * We have to extend RuntimeException or Error but not Throwable or Exception
 * */
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 50) {
            throw new TooOldException("Wait for some more time you will get better match!!");
        } else if (age < 21) {
            throw new TooYoungException("Wait for some more time your age is too young now..");
        } else {
            System.out.println("sure you will get alerts through email/sms");
        }
    }
}
