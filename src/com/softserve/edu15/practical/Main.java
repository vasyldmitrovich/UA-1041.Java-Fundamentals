package com.softserve.edu15.practical;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        printTextTask();

        printMessages();
    }

    private static void printMessages() throws InterruptedException {
        Runnable printFirstMessage = new PrintFirstMessage();
        Runnable printSecondMessage = new PrintSecondMessage();
        Thread threadFirstOption = new Thread(printFirstMessage);
        Thread threadSecondOption = new Thread(printSecondMessage);
        threadFirstOption.start();
        threadSecondOption.start();
        threadFirstOption.join();
        threadSecondOption.join();

        System.out.println("My name is Andrew");
    }

    private static void printTextTask() {
        Runnable r = new PrintText();
        Thread t = new Thread(r);
        t.start();
    }
}
