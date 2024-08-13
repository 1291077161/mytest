package com.yomahub.liteflow.bean.threadtest.demo2;

/**
 * @author Administrator
 */
public class ObjectWait {

    public static void main(String[] args) {
        Object o = new Object();


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("线程A被o.wait()阻塞前");
                synchronized(o){
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("线程A被线程B o.notify()唤醒");

            }
        },"A");

        t.start();


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("线程B唤醒线程A");
        //         synchronized (o){
        //             o.notify();
        //         }
        //     }
        // },"B").start();

        o.notifyAll();
    }
}