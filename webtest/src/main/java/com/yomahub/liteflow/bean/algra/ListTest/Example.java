package com.yomahub.liteflow.bean.algra.ListTest;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // 创建一个包含对象的列表
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 35));

        // 从列表中取出一个对象
        Person person = personList.get(1);
        System.out.println("Original person: " + person);

        String name = person.getName();
        name = "abhhh";
        char c = name.charAt(0);

        // 修改该对象的属性
        person.setAge(40);
        // person.setName("gggg");

        // 输出原列表中的对象
        System.out.println("Updated person in the list: " + personList.get(1));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
