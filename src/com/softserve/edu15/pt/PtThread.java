package com.softserve.edu15.pt;

import java.util.stream.Stream;

public class PtThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println("=======Task1=======");
        thread1.start();
        thread1.join();

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println("=======Task2=======");
        thread2.start();
        thread3.start();
        thread2.join();
        thread3.join();
        System.out.println("My name is Andrii");
    }
}
