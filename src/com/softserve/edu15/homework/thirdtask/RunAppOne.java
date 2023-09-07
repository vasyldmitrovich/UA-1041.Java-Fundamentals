package com.softserve.edu15.homework.thirdtask;

public class RunAppOne implements Runnable {
    @Override
    public void run() {
        System.out.println("First app is running");
        Runnable secondThread = new RunAppTwo();
        Thread secondApp = new Thread(secondThread);

        secondApp.start();
    }
}
