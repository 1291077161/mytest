package com.ggtest.aa;

public class ThreadTest2 extends Thread {
    private int threadNo;
    private String lock;
    private int s = 20;

    public ThreadTest2(int threadNo, String lock) {
        this.threadNo = threadNo;
        this.lock = lock;
    }

    public static void main(String[] args) throws Exception {
        String lock = new String("lock");
        for (int i = 1; i < 10; i++) {
            new ThreadTest2(i, lock).start();
            //Thread.sleep(1);
        }
    }

    public void run() {
        synchronized (this) {
            for (int i = 1; i < 10; i++) {
                System.out.println("No." + threadNo + ":" + s--);
            }
        }
    }
}