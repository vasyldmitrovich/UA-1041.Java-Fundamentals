package com.softserve.edu15.hw;

public class InnerThread {
    public static void main(String[] args) {
        Thread three = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }, "three");

        Thread two = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            System.out.println(Thread.currentThread().getName() + " was started");
            three.start();
        }, "two");

        Thread one = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " was started");
            two.start();
        }, "one");

        one.start();
    }
}
