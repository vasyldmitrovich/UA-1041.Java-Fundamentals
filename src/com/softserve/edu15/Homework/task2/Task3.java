package com.softserve.edu15.Homework.task2;

public class Task3 {
    public static void main(String[] args) {
       Thread one = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());

           Thread two = new Thread(() -> {

                    for (int i = 0; i < 3 ; i++) {
                        System.out.println("Thread number two");
                }
               //System.out.println(Thread.currentThread().getName());


            });
           two.start();
           Thread three = new Thread(() -> {

               for (int i = 0; i < 5 ; i++) {
                   System.out.println("Thread number three");
               }

           });
           three.start();
        });
       one.start();
    }

}
