package com.yomahub.liteflow.bean.interfacetest;

public class InterfaceNewImpl implements InterfaceNew , InterfaceNew1{


    @Override
    public void def() {

    }

    @Override
    public void f() {

    }



    public static void main(String[] args) {
        InterfaceNewImpl interfaceNew = new InterfaceNewImpl();
        interfaceNew.def();

        Runnable run = new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable run2 = () -> System.out.println("aaaaaaa");



    }


}