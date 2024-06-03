package com.exceotion;

import java.util.Scanner;

public class RegisterExceptionDemo {
    static String[] userNames = {"张三", "李四", "王五"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入要注册的用户名： ");
        String username = in.next();
        try {
//            checkUsername_exception(username);
            checkUsername_runtime_exception(username);
        } catch (Exception e) {
            System.out.println("注册失败，用户名已存在！");
            e.printStackTrace();
        }
        in.close();
    }

    public static void checkUsername_exception(String username){
        for (String name : userNames) {
            if (name.equals(username))
                try {
                    throw new RegisterException("该用户已经被注册了！");
                } catch (RegisterException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("aaaaa");
                }
        }
        System.out.println("注册成功！");
    }

    public static void checkUsername_runtime_exception(String username) {
        for (String name : userNames) {
            if (name.equals(username))
                throw new RegisterRuntimeException("该用户已经被注册了！");
        }
        System.out.println("注册成功！");
    }
}
