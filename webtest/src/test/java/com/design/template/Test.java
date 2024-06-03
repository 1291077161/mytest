package com.design.template;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        //1. 创建被装饰类的对象， DeHua类的对象
        Star dehua = new DeHua();

        //2. 创建装饰类的对象，需要传递进去被装饰类的对象，DeHua的对象
        DeHuaWrapper dehuaWrapper = new DeHuaWrapper(dehua);

        //3. 调用装饰类的方法
        dehuaWrapper.sing();

        System.out.println("-----------------------");

        dehuaWrapper.dance();

    }
}