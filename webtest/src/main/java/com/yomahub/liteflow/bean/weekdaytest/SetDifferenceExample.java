package com.yomahub.liteflow.bean.weekdaytest;

import java.util.HashSet;
import java.util.Set;

public class SetDifferenceExample {
    public static void main(String[] args) {
        // 创建两个Set集合
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // 添加元素到第一个Set集合
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        // 添加元素到第二个Set集合
        set2.add("banana");
        set2.add("orange");
        set2.add("grape");


        // 找出不同的元素
        Set<String> difference = new HashSet<>(set1);
        System.out.println("difference = " + difference);
        difference.removeAll(set2);

        // 输出结果
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Difference: " + difference);
    }
}
