package com.softserve.edu15.hw;

class Hw02 extends Thread {
    private final static Object LOCK1 = new Object();
    private final static Object LOCK2 = new Object();

//    now we have deadlock
    static Thread t1 = new Thread(() -> {
        synchronized (LOCK1) {
            System.out.println("Start Thread 1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (LOCK2) {
                System.out.println("End Thread 1");
            }
        }
    });
    static Thread t2 = new Thread(() -> {
        // for the end of the method main() need change monitor: synchronized (LOCK1)
        synchronized (LOCK2) {
            System.out.println("Start Thread 2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // for the end of the method main() need change monitor: synchronized (LOCK2)
            synchronized (LOCK1) {
                System.out.println("End Thread 2");
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {

        t1.start();
        t2.start();

        Thread.sleep(20);

        System.out.println(t1.getState() + " Thread 1");
        System.out.println(t2.getState() + " Thread 2");

    }
}
