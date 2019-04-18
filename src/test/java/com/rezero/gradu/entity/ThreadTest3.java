package com.rezero.gradu.entity;

public class ThreadTest3 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Run {
    public static void main(String[] args) {
        try {
            ThreadTest3 thread = new ThreadTest3();
            thread.setDaemon(true);
            thread.start();
            System.out.println("pointcut");
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}