package com.yomahub.liteflow.bean.threadLocalTest;

import org.springframework.util.StopWatch;

public class StopWatchExample {
    public static void main(String[] args) throws InterruptedException {
        final StopWatch stopWatch = new StopWatch();

        // 创建多个线程，每个线程执行计时操作
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                stopWatch.start();
                try {
                    // 模拟线程执行任务
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                stopWatch.stop();
                System.out.println(Thread.currentThread().getName() + " elapsed time: " + stopWatch.getTotalTimeMillis() + " ms");
            });
        }

        // 启动线程
        for (Thread thread : threads) {
            thread.start();
        }

        // 等待所有线程执行完毕
        for (Thread thread : threads) {
            thread.join();
        }

        // 打印总计时信息
        System.out.println("Total elapsed time: " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
