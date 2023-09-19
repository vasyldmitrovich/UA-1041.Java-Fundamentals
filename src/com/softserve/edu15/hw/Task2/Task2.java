package com.softserve.edu15.hw.Task2;

public class Task2 {
    public synchronized static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()-> {
            try {
                Task2.main(null);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
        System.out.println("Hi");
        thread.join();
    }
}
