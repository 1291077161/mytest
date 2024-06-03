package com.multiplethread.cpu;

public class Test1<T>{

    public  void testMethod(T t){
        System.out.println(t.getClass().getName());
    }
    public  <T> T testMethod1(T t){
        return t;
    }


    public static void main(String[] args) {
        Test1<String> t = new Test1<String>();
        t.testMethod("generic");
        Integer integer = new Integer(1);
        Integer i = t.testMethod1(new Integer(1));

    }
}