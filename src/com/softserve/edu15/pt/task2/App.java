package com.softserve.edu15.pt.task2;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Hello, World!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Peace in the World!");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Java!");
    }
}
