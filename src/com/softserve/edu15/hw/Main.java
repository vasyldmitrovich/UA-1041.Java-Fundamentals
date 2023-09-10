package com.softserve.edu15.hw;

public class Main {
    public static final Object FORK = new Object();
    public static final Object KNIFE = new Object();

    public static void main(String[] args) throws InterruptedException {

        runFirstTask();
        runSecondTask();
        runThirdTask();
    }

    public static void runThirdTask() {
        Thread one = new Thread(() -> {
            System.out.println("Thread one begin");
            Thread two = new Thread(() -> {
                Thread three = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread three is running");
                    }
                });

                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread two is running");
                }

                three.start();
            });
            two.start();
        });

        one.start();
    }

    public static void runSecondTask() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (FORK) {
                System.out.println("Thread 1 holding fork");
                try {
                    Thread.sleep(500);
                    System.out.println("Thread 1 waiting for knife");
                    synchronized (KNIFE) {
                        System.out.println("Thread 1 get knife");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (KNIFE) {
                System.out.println("Thread 2 holding knife");
                try {
                    Thread.sleep(1000);
                    System.out.println("Thread 2 waiting for fork");
                    synchronized (FORK) {
                        System.out.println("Thread 2 get fork");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });


        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I will appear if there won't be any deadlocks(((");
    }

    public static void runFirstTask() throws InterruptedException {
        Thread thread1 = createThread("Apple", 3);
        Thread thread2 = createThread("Banana", 2);
        Thread thread3 = createThread("Orange", 1);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        thread3.start();
    }

    public static Thread createThread(String msg, int timeInSec) {
        int milisecs = timeInSec * 1000;
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(msg);
                try {
                    Thread.sleep(milisecs);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                    throw new RuntimeException();
                }
            }
        });
    }
}