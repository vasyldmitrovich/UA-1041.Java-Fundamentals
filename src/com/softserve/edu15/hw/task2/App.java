package com.softserve.edu15.hw.task2;

public class App {
    private static final Object LOCK = new Object();
    private static final Object LOCK1 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                synchronized (LOCK1) {
                    System.out.println("Finished");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (LOCK1) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                synchronized (LOCK) {
                    System.out.println("Finished");
                }
            }
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
