package com.softserve.edu15.hm;

public class Task3 {
    public static void main(String[] args) {
        new Thread(() -> {
            new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number 2");
                }
                new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                }).start();
            }).start();
        }).start();
    }
}
