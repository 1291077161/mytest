package com.design.pattern.zuhepattern;

public class Department implements Component {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Department: " + name);
    }

    @Override
    public void add(Component component) {
        // 在叶节点中添加子组件不支持，可以抛出异常或者忽略
    }

    @Override
    public void remove(Component component) {
        // 在叶节点中移除子组件不支持，可以抛出异常或者忽略
    }
}