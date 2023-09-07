package com.softserve.edu15.homework.thirdtask;

public class Main {
    public static void main(String[] args) {


        printMessages();
    }

    private static void printMessages() {
        Runnable printFirstMessage = new RunAppOne();
        Thread threadFirstOption = new Thread(printFirstMessage);

        threadFirstOption.start();
    }
}
