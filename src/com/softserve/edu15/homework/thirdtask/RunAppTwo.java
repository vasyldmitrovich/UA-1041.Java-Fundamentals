package com.softserve.edu15.homework.thirdtask;

public class RunAppTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("Second app is running");

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }

        Runnable thirdThread = new RunAppThree();
        Thread thirdApp = new Thread(thirdThread);

        thirdApp.start();
    }
}
