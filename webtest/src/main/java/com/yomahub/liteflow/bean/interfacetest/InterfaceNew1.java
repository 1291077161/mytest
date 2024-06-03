package com.yomahub.liteflow.bean.interfacetest;

public interface InterfaceNew1 {
    default void def() {
        System.out.println("InterfaceNew1 default方法");
    }
}