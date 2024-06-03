package com.SHD.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        //TimeUnit.MINUTES
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        List<Object> a1 = list.stream().map(a -> a.startsWith("a")).collect(Collectors.toList());
        //System.out.printf("", a1);

        String DEST_PACKING_GENERATION = String.format("%s:%s", "TOPIC_PACKING_GENERATION", "TAG-WH-TRANS");
        System.out.println("DEST_PACKING_GENERATION = " + DEST_PACKING_GENERATION);

    }
}
