package com.softserve.edu15.hw.task2;

public class Task2 {


    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {

        System.out.println("Start");

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1 have got lock 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is waiting for lock 1");
                synchronized (lock1) {
                    System.out.println("Thread 2 have got lock 1.");
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("End");
    }
}
