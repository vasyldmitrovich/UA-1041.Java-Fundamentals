package com.softserve.edu15.hw.Task3;

import java.io.IOException;

public class Task3 {
    private static ProcessBuilder thread2;

    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            try {
                thread2.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2=new Thread(()->{
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }

        });
        Thread thread3=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread three");
            }
        });
        thread2.start();
        thread3.start();
    }
}
