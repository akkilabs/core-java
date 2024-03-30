package com.practice.exceptionhandling;

public class TooOldException extends RuntimeException {
    TooOldException(String s) {
        super(s);
    }
}
