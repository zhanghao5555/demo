package com.company.project.core;

public class ThreadPoolManager implements Runnable {

    public static void main(String[] args) {
        ThreadPoolManager mt = new ThreadPoolManager();

        Thread t1 = new Thread(mt, "t1");

        Thread t2 = new Thread(mt, "t2");

        Thread t3 = new Thread(mt, "t3");

        Thread t4 = new Thread(mt, "t4");

        Thread t5 = new Thread(mt, "t5");

        Thread t6 = new Thread(mt, "t6");

        t1.start();

        t2.start();

        t3.start();

        t4.start();

        t5.start();

        t6.start();
    }

    private int count;

    public void run() {

        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName() + "获得了锁");
                Thread.sleep(5000);
                System.out.println("执行任务" + count++);
            } catch (InterruptedException e) {

            } finally {
                System.out.println(Thread.currentThread().getName() + "没了锁");
            }

        }

    }
}