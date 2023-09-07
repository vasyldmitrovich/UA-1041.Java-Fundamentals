package com.softserve.edu15.homework.secondtask;


import static com.softserve.edu15.homework.secondtask.Main.FIRST_KEY;
import static com.softserve.edu15.homework.secondtask.Main.SECOND_KEY;

public class FirstThread implements Runnable {
    @Override
    public void run() {
        synchronized (FIRST_KEY) {
            System.out.println("Thread 1: Holding lock 1...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1: Waiting for lock 2...");
            synchronized (SECOND_KEY) {
                System.out.println("Thread 1: Acquired lock 2.");
            }
        }
    }
}
