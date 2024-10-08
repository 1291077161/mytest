package com.yomahub.liteflow.bean.threadtest.juctest.retrant;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Joy
 * @date 2024/8/13
 *
 */

@Slf4j
public class Demo2 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        log.info("准备加锁....");
        reentrantLock.lock();
        log.info("加锁成功....");
        reentrantLock.unlock();
        log.info("释放锁成功....");


    }
}
