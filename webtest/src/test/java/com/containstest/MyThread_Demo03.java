package com.containstest;

/***
 * @Title MyThread_Demo03
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/12/10 21:00
 * @Version 1.0.0
 */
public class MyThread_Demo03 extends Thread {
    //Thread.sleep();
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                if ((i) % 10 == 0) {
                    System.out.println("‐‐‐‐‐‐‐" + i);
                }
                System.out.print(i);
                try {
                    Thread.sleep(1000);
                    System.out.print(" 线程睡眠1秒！\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new MyThread_Demo03().start();
    }

}
