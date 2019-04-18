package com.rezero.gradu.entity;

public class ThreadTest {

    private static Object o = new Object();
    private static Object o1 = new Object();
    private static Object o2 = new Object();

    static class A implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100; i += 2){
                synchronized (o){
                    try {
                        o1.wait();
                        System.out.println(i);
                        o2.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    static class B implements Runnable{

        @Override
        public void run () {
            o1.notify();
            for (int i = 1; i < 100; i += 2){

                synchronized (o) {
                    try {

                        System.out.println(i);
                        o1.notify();
                        o2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }


    }

    public static void main(String[] args) {
        Thread a = new Thread(new A());
        Thread b = new Thread(new B());

        a.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();

    }



}
