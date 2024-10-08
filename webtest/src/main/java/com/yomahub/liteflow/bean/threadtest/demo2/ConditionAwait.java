package com.yomahub.liteflow.bean.threadtest.demo2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Administrator
 */
public class ConditionAwait {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程A被condition.await()阻塞前");
                try {
                    TimeUnit.SECONDS.sleep(1);
                    lock.lock();
                    condition.await();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
                System.out.println("线程A被线程B condition.signl()唤醒");
            }
        }, "A").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    // TimeUnit.SECONDS.sleep(1);
                    System.out.println("线程B中使用condition.signal()唤醒线程A");
                    condition.signal();
                } catch (Exception e) {
                } finally {
                    lock.unlock();
                    System.out.println("线程B释放锁了");
                }
            }
        }, "B").start();

    }
}

// 结果：
//         线程A被condition.await()阻塞前
// 线程B中使用condition.signal()唤醒线程A
// 线程A被线程B condition.signl()唤醒