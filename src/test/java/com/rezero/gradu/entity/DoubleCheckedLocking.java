package com.rezero.gradu.entity;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.rezero.gradu.task.InstanceTask;

import java.util.concurrent.*;

public class DoubleCheckedLocking {

    private static DoubleCheckedLocking instace;

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstace() {
        if(instace == null){
            synchronized (DoubleCheckedLocking.class)
            {
                if (instace == null){
                    instace = new DoubleCheckedLocking();
                }
            }
        }

        return instace;
    }

    public static void main(String[] args) throws InterruptedException {
        int corePoolSize = 4;

        int maxPoolSize = 4;


        InstanceTask task = new InstanceTask();
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("scan-number-%d").build();

        ExecutorService executor = new ThreadPoolExecutor(corePoolSize, maxPoolSize,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 1000; i++) {
            executor.execute(new InstanceTask());
        }
        executor.shutdown();
        while (!executor.awaitTermination(100, TimeUnit.MILLISECONDS)) {
            System.out.println("worker running");
        }

    }
}
