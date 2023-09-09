package com.softserve.edu15.hw.task2;

public class Deadlock {

    final static Object mainObject = new Object();
    final static Object threadObject = new Object();
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            synchronized (threadObject){
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (mainObject){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });

        thread.start();

        synchronized (mainObject){
            Thread.sleep(700);
            synchronized (threadObject){
                System.out.println(Thread.currentThread().getName());
            }
        }


    }
}
