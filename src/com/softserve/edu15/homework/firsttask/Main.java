package com.softserve.edu15.homework.firsttask;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        printMessages();
    }

    private static void printMessages() throws InterruptedException {
        Runnable printFirstMessage = new HwPrintFirstMessage();
        Thread threadFirstOption = new Thread(printFirstMessage);
        Runnable printSecondMessage = new HwPrintSecondMessage();
        Thread threadSecondOption = new Thread(printSecondMessage);
        Runnable printThirdMessage = new HwPrintThirdMessage();
        Thread threadThirdOption = new Thread(printThirdMessage);
        threadFirstOption.start();
        threadSecondOption.start();
        threadFirstOption.join();
        threadSecondOption.join();
        threadThirdOption.start();
    }
}
