package com.softserve.edu15.hw;

public class Hw01 {
    public static void main(String[] args) throws InterruptedException {
        var tr1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("I`m first!");
            }
        }
        );
        var tr2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("I`m second!");
            }
        }
        );
        var tr3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Now My turn!");
            }
        }
        );
        tr1.start();
        tr2.start();
        tr1.join();
        tr2.join();
        tr3.start();

    }
}
