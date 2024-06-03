package com.yomahub.liteflow.bean.threadLocalTest.demo2;

import lombok.SneakyThrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDateFormat {
    private static final ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = 
        ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));


    public static String format(Date date) {
        return dateFormatThreadLocal.get().format(date);
    }

    public static Date parse(String dateStr) throws ParseException {
        return dateFormatThreadLocal.get().parse(dateStr);
    }

    @SneakyThrows
    public static void main(String[] args) {
        Runnable task = () -> {
            String dateStr = "2024-05-15";
            try {
                Date date = ThreadLocalDateFormat.parse(dateStr);
                System.out.println("Parsed date: " + ThreadLocalDateFormat.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }


        // for (int i = 0; i < 10; i++) {
        //
        // }

        System.in.read();
    }
}
