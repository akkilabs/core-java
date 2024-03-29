package com.practice.exceptionhandling;

public class Demo1 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
        /*
        * java.lang.ArithmeticException: / by zero
	      at com.practice.exceptionhandling.Demo1.main(Demo1.java:6)
	    * */
            e.printStackTrace();

        /*
        java.lang.ArithmeticException: / by zero
        * */
            //System.out.println(e.toString());
            System.out.println(e);

            /* / by zero */
            System.out.println(e.getMessage());
        }
    }
}
