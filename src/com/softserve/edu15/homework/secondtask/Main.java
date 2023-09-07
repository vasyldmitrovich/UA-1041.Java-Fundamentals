package com.softserve.edu15.homework.secondtask;

public class Main {
    public static final Object FIRST_KEY = new Object();
    public static final Object SECOND_KEY = new Object();

    public static void main(String[] args) {

        Runnable firstRun = new FirstThread();
        Thread firstThread = new Thread(firstRun);
        Runnable secondRun = new SecondThread();
        Thread secondThread = new Thread(secondRun);

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        This line will never be printed because of the deadlock
        System.out.println("Both threads are finished");

    }
}
