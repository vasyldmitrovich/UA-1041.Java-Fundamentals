package com.softserve.edu15.hw.task1;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("1Hello, World!");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("2Hello, World!");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("3Hello, World!");
        }
    }
}
