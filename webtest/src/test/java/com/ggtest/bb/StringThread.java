package com.ggtest.bb;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class StringThread implements Runnable {

    private static final String LOCK_PREFIX = "XXX---";
    
    private String ip;
    
    public StringThread(String ip) {
        this.ip = ip;
    }

    @SneakyThrows
    @Override
    public void run() {
        String lock = buildLock();
        synchronized (this) {
            System.out.println("[" + Thread.currentThread().getName() + "]开始运行了");
            // 休眠5秒模拟脚本调用
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("[" + Thread.currentThread().getName() + "]结束运行了");
        }
    }
    
    private String buildLock() {
        StringBuilder sb = new StringBuilder();
        sb.append(LOCK_PREFIX);
        sb.append(ip);

        String lock = sb.toString().intern();
        System.out.println("[" + Thread.currentThread().getName() + "]构建了锁[" + lock + "]");

        return lock;
    }
    
}