package com.ggtest.bb;

import java.util.concurrent.atomic.AtomicInteger;

public class StringThreadTest {

    private static final int THREAD_COUNT = 5;
    
    // @Test
    // public void testStringThread() {
    //     //StringThread s = new StringThread("192.168.1.1");
    //     Thread[] threads = new Thread[THREAD_COUNT];
    //     for (int i = 0; i < THREAD_COUNT; i++) {
    //         threads[i] = new Thread(new StringThread("192.168.1.1"));
    //         //threads[i] = new Thread(s);
    //     }
    //
    //     for (int i = 0; i < THREAD_COUNT; i++) {
    //         threads[i].start();
    //     }
    //
    //     for (;;);
    // }

    //@SneakyThrows
    public static void main(String[] args) {
        //Lock lock = new ReentrantLock();
        //Condition condition = lock.newCondition();
        //condition.await();
        //condition
        //Map.Entry
        //entry


        AtomicInteger atomicInteger = new AtomicInteger();
        for (int i = 0; i < 10; i++) {
            atomicInteger.getAndIncrement();
        }
        System.out.println(atomicInteger.get());

    }
    
}