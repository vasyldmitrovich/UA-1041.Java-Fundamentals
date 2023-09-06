package com.softserve.edu15.pt.task_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        var t1 = getThread1();
        var t2 = getThread2();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Mykola");
    }

    private static Thread getThread1() {
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private static Thread getThread2() {
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
