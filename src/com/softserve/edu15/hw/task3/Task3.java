package com.softserve.edu15.hw.task3;

public class Task3 {


    public static void main(String[] args) {
        new Thread(() -> {

            System.out.println("Thread one");
            new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread two");
                }
                new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread three");
                    }
                }).start();
            }).start();
        }).start();
    }
}
