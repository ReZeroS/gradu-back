package com.rezero.gradu.entity;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest2 {

    private static Lock lock = new ReentrantLock();
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();

    public static void main(String[] args) {

        // thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 999; i += 2) {
                lock.lock();
                try {
                    condition2.signal();
                    System.out.println("current:" + i);
                    condition1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
        });

        // thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 1000; i += 2) {
                lock.lock();
                try {
                    condition1.signal();
                    System.out.println("current:" + i);
                    condition2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();

            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
