package com.design.pattern.zuhepattern;

import java.util.ArrayList;
import java.util.List;

public class College implements Component {
    private String name;
    private List<Component> departments = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("College: " + name);
        for (Component department : departments) {
            department.display();
        }
    }

    @Override
    public void add(Component component) {
        departments.add(component);
    }

    @Override
    public void remove(Component component) {
        departments.remove(component);
    }
}