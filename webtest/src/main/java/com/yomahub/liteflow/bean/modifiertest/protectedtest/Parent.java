package com.yomahub.liteflow.bean.modifiertest.protectedtest;
/**
 *
 * @author Joy
 * @date 2024/6/17
 * @param 
 * 
 */

public class Parent {
    protected void protectedMethod() {
        System.out.println("Protected method in Parent");
    }
}

class Child extends Parent {
    public void callProtectedMethod() {
        // 调用父类的protected方法
        protectedMethod();

        // 也可以通过super关键字调用
        super.protectedMethod();
    }
}


class Main {
    public static void main(String[] args) {

        // Child child = new Child();
        // child.callProtectedMethod();


        Parent parent = new Parent();
        parent.protectedMethod();
    }
}


