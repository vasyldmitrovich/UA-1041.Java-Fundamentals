package com.softserve.edu15.pt;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //task1
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });


        //task2
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the world");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        thread1.start();
        thread1.join();

        thread2.start();
        thread3.start();
        thread2.join();
        thread3.join();

        System.out.println("My name is ivan");
    }

}
