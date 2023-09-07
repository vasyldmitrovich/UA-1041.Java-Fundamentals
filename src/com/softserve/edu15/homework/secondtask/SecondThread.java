package com.softserve.edu15.homework.secondtask;

import static com.softserve.edu15.homework.secondtask.Main.FIRST_KEY;
import static com.softserve.edu15.homework.secondtask.Main.SECOND_KEY;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        synchronized (SECOND_KEY) {
            System.out.println("Thread 2: Holding lock 2...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2: Waiting for lock 1...");
            synchronized (FIRST_KEY) {
                System.out.println("Thread 2: Acquired lock 1.");
            }
        }
    }
}
