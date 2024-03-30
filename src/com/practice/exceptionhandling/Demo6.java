package com.practice.exceptionhandling;

public class Demo6 {
    /*Exception Handling Keywords Summary
     * try - to maintain risky code
     * catch - to maintain handling code
     * finally - to maintain clean up code
     * throw - to hand over our own Exception objection to the JVM programmatically
     * throws - to delegate the responsibility of handling Exceptions to the caller methods
     * throws keyword can be used only for checked exceptions. If we are using for Unchecked Exceptions there is no impact/use
     * throws keyword can be used just to convenience the compiler and can't stop abnormal termination
     * to convenience compiler
     * */
    public static void main(String[] args) {

        /* An Exception is checked compulsory that should
         * handle either by tyr and catch or by throws keyword */

        //throw new Exception(); // CErr: Unreported Exception java.lang.Exception: must be caught or declared to be thrown

        /*
         * An Error is Unchecked it is not required to handle either by try and catch or throws
         * */

        throw new Error(); // No CErr, RE: Exception in thread "main" java.lang.Error - at com.practice.exceptionhandling.Demo6.main(Demo6.java:22)

    }
}
