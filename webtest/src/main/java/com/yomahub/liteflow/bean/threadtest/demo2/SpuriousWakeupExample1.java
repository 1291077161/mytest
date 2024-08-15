package com.yomahub.liteflow.bean.threadtest.demo2;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Administrator
 */
public class SpuriousWakeupExample1 {

    private static volatile boolean taskAvailable = false;

    public static void main(String[] args) throws InterruptedException {
        Thread consumerThread = new Thread(() -> {
            while (true) {
                if (!taskAvailable) {
                    System.out.println("No task available, consumer is parking.");
                    LockSupport.park();
                }

                // 检查中断状态
                if (Thread.interrupted()) {
                    System.out.println("Consumer thread was interrupted.");
                    break;
                }

                if (taskAvailable) {
                    System.out.println("Consumer is processing the task.");
                    taskAvailable = false; // Reset task
                } else {
                    System.out.println("Consumer woke up but no task available (spurious wakeup).");
                }
            }
        });

        consumerThread.start();

        // 确保消费者进入park状态
        Thread.sleep(1000);

        // 模拟生产者创建任务并唤醒消费者
        System.out.println("Producer is creating a task.");
        taskAvailable = true;
        LockSupport.unpark(consumerThread);

        // 等待消费者处理任务
        Thread.sleep(1000);

        // 再次唤醒消费者（这次可能发生伪唤醒）
        System.out.println("Producer is un-parking consumer again.");
        LockSupport.unpark(consumerThread);

        // 等待输出结果
        consumerThread.join(2000);
    }
}
