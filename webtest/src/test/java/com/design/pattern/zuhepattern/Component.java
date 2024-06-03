package com.design.pattern.zuhepattern;

public interface Component {
    String getName();
    void display();
    void add(Component component);
    void remove(Component component);
}