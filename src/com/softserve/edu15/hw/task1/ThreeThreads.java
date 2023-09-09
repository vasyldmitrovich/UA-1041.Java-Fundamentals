package com.softserve.edu15.hw.task1;

public class ThreeThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hello from " + Thread.currentThread().getName());
            }
        });

        Thread thread2 = new Thread(new SecondThread());
        ThirdThread thread3 = new ThirdThread();

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        thread3.start();
    }



    static class SecondThread implements Runnable{
        @Override
        public void run() {
            for(int i = 0; i < 5; i++){
                System.out.println("Hi from " + Thread.currentThread().getName());
            }
        }

    }

    static class ThirdThread extends Thread{
        @Override
        public void run() {
            for(int i = 0; i < 5; i++){
                System.out.println("Thread " + Thread.currentThread().getName() + " is running");
            }
        }
    }

}
