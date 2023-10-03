package com.softserve.edu15.Homework.task1;

public class Task1 {
    public static void main(String[]args) {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, how are you?");
                            }

        });
        t1.start();
        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, I am great!And you?");
            }

        });
        t2.start();
        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Great!Let's go to the mall!");
            }

        });
        t3.start();

    }
}
