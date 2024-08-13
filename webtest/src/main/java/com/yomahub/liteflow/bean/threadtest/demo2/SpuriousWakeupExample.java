package com.yomahub.liteflow.bean.threadtest.demo2;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Administrator
 */
public class SpuriousWakeupExample {

    private static volatile boolean taskAvailable = false;

    public static void main(String[] args) throws InterruptedException {
        Thread consumerThread = new Thread(() -> {
            while (true) {
                // 如果没有任务可用，线程将阻塞
                while (!taskAvailable) {
                    System.out.println("No task available, consumer is parking.");
                    LockSupport.park();

                    if (Thread.interrupted()) {
                        System.out.println("Consumer thread was interrupted.");
                        return;
                    }

                    // 这里重新检查条件以处理可能的伪唤醒
                    System.out.println("Consumer woke up, checking task availability.");
                }

                // 当任务可用时，执行任务
                System.out.println("Consumer is processing the task.");
                // 任务完成后重置标志
                taskAvailable = false;
            }
        });

        consumerThread.start();

        // 确保消费者进入park状态
        Thread.sleep(1000);

        // 情况1: 模拟生产者创建任务并唤醒消费者
        System.out.println("Producer is creating a task.");
        taskAvailable = true;
        LockSupport.unpark(consumerThread);

        // 等待消费者处理任务
        Thread.sleep(1000);

        // 情况2: 模拟伪唤醒
        System.out.println("Producer is calling unpark without a task (simulating spurious wakeup).");
        LockSupport.unpark(consumerThread);

        // 等待输出结果
        Thread.sleep(1000);
    }
}
