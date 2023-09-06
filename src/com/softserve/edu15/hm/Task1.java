package com.softserve.edu15.hm;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("World");
            }
        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("says");
            }
        });

        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

    }
}
