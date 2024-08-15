package com.yomahub.liteflow.bean.threadtest.demo2;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Joy
 * @date 2024/8/1
 *
 */

public class JoinExample {
    private final Object lock = new Object();

    public void exampleMethod() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread t1 holds the lock.");
                try {
                    Thread.sleep(1000); // t1 睡眠1秒
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Thread t1 releases the lock.");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread t2 holds the lock.");
            }
        });

        t1.start();
        TimeUnit.MILLISECONDS.sleep(200);

        synchronized (lock) {
            try {
                System.out.println("Main thread holds the lock and waits for t1 to finish.");
                t1.join(); // main线程等待t1线程完成，但不释放lock锁
                System.out.println("t1 has finished, main thread continues.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        t2.start();

        // lock.
    }

    public static void main(String[] args) throws InterruptedException {
        new JoinExample().exampleMethod();
    }
}
