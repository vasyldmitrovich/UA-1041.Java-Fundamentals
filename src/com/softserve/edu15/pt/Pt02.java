package com.softserve.edu15.pt;

public class Pt02 {
    public static void main(String[] args) throws InterruptedException {
        var tr1 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        var tr2 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the world");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        tr1.start();
        tr2.start();
        tr1.join();
        tr2.join();
        System.out.println("My name is Java");
    }
}
