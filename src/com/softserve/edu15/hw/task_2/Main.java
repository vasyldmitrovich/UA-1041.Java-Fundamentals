package com.softserve.edu15.hw.task_2;

public class Main {
    private static final Object FIRST = new Object();
    private static final Object SECOND = new Object();

    public static void main(String[] args) throws InterruptedException {
        var t1 = getThread1();
        var t2 = getThread2();
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println(t1.getState());
        System.out.println(t2.getState());


    }

    private static Thread getThread1() {
        return new Thread(() -> {
            synchronized (FIRST) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (SECOND) {
                    System.out.println("Done!!!");
                }
            }
        });
    }

    private static Thread getThread2() {
        return new Thread(() -> {
            synchronized (SECOND) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (FIRST) {
                    System.out.println("Done!!!");
                }
            }
        });
    }
}
