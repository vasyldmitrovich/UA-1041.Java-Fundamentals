package com.softserve.edu15.pt.task2;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {


        Thread v1 = createTexThread("Hello world",5,2000);
        Thread v2 = createTexThread("Peace in the world",5,3000);


        v1.start();
        v2.start();

        v1.join();
        v2.join();

        System.out.println("My name is Roman");
    }


    public static Thread createTexThread(String text, int times, int millis) {
        return new Thread(()-> {
            for (int i = 1; i <= times; i++) {

                System.out.println(text);
                try {
                    Thread.sleep(millis);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
