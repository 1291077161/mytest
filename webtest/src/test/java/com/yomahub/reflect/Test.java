package com.yomahub.reflect;

import java.lang.String;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws Exception {
        // 获取Person类的Class对象
        Class<Person> c = Person.class;
        Person person1 = c.newInstance();
        System.out.println("person1 = " + person1);

        // 获得指定的构造方法:
        // 获取第一个构造方法对象
        Constructor<Person> con1 = c.getDeclaredConstructor();
        System.out.println("con1:" + con1);

        Person person2 = con1.newInstance();
        System.out.println("person2 = " + person2);
        System.out.println("person1.equals(person2) = " + person1.equals(person2));

        // 获取第二个构造方法对象
        Constructor<Person> con2 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println("con2:" + con2);

        // 获取第三个构造方法对象
        Constructor<Person> con3 = c.getDeclaredConstructor(int.class);
        System.out.println("con3:" + con3);

        // 获取第四个构造方法对象
        Constructor<Person> con4 = c.getDeclaredConstructor(String.class);
        System.out.println("con4:" + con4);

        // 获取所有的构造方法
        Constructor<?>[] arr = c.getDeclaredConstructors();
        for (Constructor<?> con : arr) {
            System.out.println(con);
        }
        System.out.println("========");
        // 通过反射执行con1表示的构造方法
        Person p1 = con1.newInstance();
        System.out.println("p1:" + p1);

        // 通过反射执行con2表示的构造方法
        Person p2 = con2.newInstance("张三", 18);
        System.out.println("p2:" + p2);

        System.out.println("p1.equals(p2) = " + p1.equals(p2));

        // 通过反射执行con3表示的构造方法
        Person p3 = con3.newInstance(19);
        System.out.println("p3:" + p3);

        // 通过反射执行con4表示的构造方法
        con4.setAccessible(true);// 取消权限检查
        Person p4 = null;
        try {
            p4 = con4.newInstance("王五",18, 33, "fsfs");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("p4:" + p4);

        Person person = new Person("aa", 12, 18, "daff");
        //person.setName("nfsiufj");
        System.out.println("person.getName() = " + person.getName());


        //Class
    }

}