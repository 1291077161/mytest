package com.yomahub.liteflow.bean.threadtest.demo2;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Administrator
 */


public class LockSupportDemo {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("线程A被LockSupport.park()阻塞");
                LockSupport.unpark(Thread.currentThread());
                LockSupport.park();
                LockSupport.park();

                System.out.println("线程A被线程B LockSupport.unpark()唤醒");

            }
        },"A");

        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程B唤醒线程A");
                // 唤醒指定线程t，也就是A
                LockSupport.unpark(t);
                LockSupport.unpark(t);
            }
        },"B").start();

        // LockSupport.park();
        // LockSupport.unpark(Thread.currentThread());
    }

}

// 结果：
//         线程A被LockSupport.park()阻塞
// 线程B唤醒线程A
// 线程A被线程B LockSupport.unpark()唤醒