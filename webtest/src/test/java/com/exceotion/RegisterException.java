package com.exceotion;

public class RegisterException extends Exception {
    public RegisterException(String message) {
        super(message);  // 受查异常
        System.out.println("受查异常");
    }
}
