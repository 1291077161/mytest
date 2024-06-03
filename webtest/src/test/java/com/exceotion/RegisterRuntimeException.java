package com.exceotion;

public class RegisterRuntimeException extends RuntimeException {
    public RegisterRuntimeException(String message) {
        super(message);  // 非受查异常！
        System.out.println("非受查异常！");
    }
}
