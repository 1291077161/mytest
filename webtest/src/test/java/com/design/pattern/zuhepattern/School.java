package com.design.pattern.zuhepattern;

import java.util.ArrayList;
import java.util.List;

public class School implements Component {
    private String name;
    private List<Component> colleges = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("School: " + name);
        for (Component college : colleges) {
            college.display();
        }
    }

    @Override
    public void add(Component component) {
        colleges.add(component);
    }

    @Override
    public void remove(Component component) {
        colleges.remove(component);
    }
}