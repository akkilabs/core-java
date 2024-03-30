package com.practice.exceptionhandling;

public class Demo5 {
    static ArithmeticException ae = new ArithmeticException();
    static ArithmeticException ae1;

    public static void main(String[] args) {
        ArithmeticException ae2 = new ArithmeticException();
        System.out.println(ae);
        System.out.println(ae1);
        throw ae1; //NullPointerException - as we didn't assign any value to ae1 (default value null)
        //throw ae2; //Exception in thread "main" java.lang.ArithmeticException at com.practice.exceptionhandling.Demo5.main(Demo5.java:8)

        /*
         ** Generally throw keyword meant for customized exceptions, but not for predefined exceptions **
         ** After throw keyword we are not allowed to write any statement, otherwise we will get compile time error: "unreachable statement"
         */
    }
}
