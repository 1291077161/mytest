package com.yomahub.liteflow.bean.designpattern.guanchazhepattern;

public class ConcreteObserver implements Observer {

    private Object name;
    private Subject subject;

    public ConcreteObserver(Object name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(name+" received notification");
    }
}
