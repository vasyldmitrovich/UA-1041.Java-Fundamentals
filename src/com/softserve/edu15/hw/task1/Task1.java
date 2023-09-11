package com.softserve.edu15.hw.task1;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        Thread v1 = createTexThread("Hello World!", 5, 2000);
        Thread v2 = createTexThread("Peace in the world!", 5, 1000);
        Thread v3 = createTexThread("GoodBye!", 5, 1500);


        v1.start();
        v2.start();

        v1.join();
        v2.join();
        v3.start();
    }

    public static Thread createTexThread(String text, int times, int millis) {
        return new Thread(() -> {
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
