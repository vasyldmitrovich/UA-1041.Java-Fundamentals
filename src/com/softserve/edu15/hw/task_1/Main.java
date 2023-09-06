package com.softserve.edu15.hw.task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        var t1 = getThread1();
        var t2 = getThread2();
        var t3 = getThread3();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
    }

    private static Thread getThread1() {
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("I");
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
                System.out.println("like");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    private static Thread getThread3() {
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
