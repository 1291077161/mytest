package com.yomahub.liteflow.bean.threadtest.demo2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author Administrator
 */
public class LockSupportExample {

    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();

        Thread thread = new Thread(() -> {
            System.out.println("Child thread is about to unpark the main thread.");
            // LockSupport.unpark(mainThread); // 唤醒主线程
            // LockSupport.unpark(mainThread); // 唤醒主线程
            LockSupport.park();

            
            System.out.println("Child thread has unparked the main thread.");
        });

        thread.start();

        TimeUnit.SECONDS.sleep(1);







        System.out.println("Main thread is going to park.");
        // 阻塞主线程，等待唤醒
        // LockSupport.park();
        // 唤醒主线程
        // LockSupport.unpark(mainThread);
        // LockSupport.park();
        // LockSupport.park();
        // thread.join();
        System.out.println("Main thread is resumed.");
    }
}
