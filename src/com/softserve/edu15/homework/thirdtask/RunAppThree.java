package com.softserve.edu15.homework.thirdtask;

public class RunAppThree implements Runnable {

    @Override
    public void run() {
        System.out.println("Third app is running");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }
    }
}
