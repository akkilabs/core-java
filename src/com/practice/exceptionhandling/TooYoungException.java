package com.practice.exceptionhandling;

public class TooYoungException extends RuntimeException {
    TooYoungException(String s) {
        super(s);
    }
}
