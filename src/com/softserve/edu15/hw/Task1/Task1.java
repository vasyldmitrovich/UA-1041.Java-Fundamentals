package com.softserve.edu15.hw.Task1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");

            }
        }
        );
        Thread thread2=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hallo");

            }
        }
        );
        Thread thread3=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Привіт");

            }
        }
        );
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();

        thread3.start();
    }
}
