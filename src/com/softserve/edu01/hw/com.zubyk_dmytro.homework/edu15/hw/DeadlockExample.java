package edu15.hw;
public class DeadlockExample {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number one");
                }
                lock.notify(); // Notify other threads
            }
        });

        Thread two = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // Wait for notification from Thread one
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                lock.notify(); // Notify other threads
            }
        });

        Thread three = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // Wait for notification from Thread two
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            }
        });

        one.start();
        two.start();
        three.start();

        try {
            one.join();
            two.join();
            three.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
