package com.yomahub.liteflow.bean.threadtest.demo2;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author Administrator
 */
@Slf4j
public class SimpleLock {
    private static volatile Thread lockingThread = null;

    public void lock() {
        Thread currentThread = Thread.currentThread();
        // System.out.println(Thread.currentThread().getName());

        // 如果锁已经被其他线程持有，阻塞当前线程
        while (!tryLock()) {
            // while (true) {
            System.out.println(currentThread.getName() + " is waiting for the lock.");
            // 设置this作为blocker对象
            LockSupport.park(this);
        }
    }

    public boolean tryLock() {
        if (lockingThread == null) {
            lockingThread = Thread.currentThread();
            log.info("lockingThread: {}", lockingThread);
            return true;
        }
        return false;
    }

    public void unlock() {
        if (Thread.currentThread() == lockingThread) {
            lockingThread = null;
            // 唤醒当前线程
            LockSupport.unpark(Thread.currentThread());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleLock lock = new SimpleLock();

        Runnable task = () -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock.");
                // Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released the lock.");
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        TimeUnit.SECONDS.sleep(1);
        t2.start();
    }
}
