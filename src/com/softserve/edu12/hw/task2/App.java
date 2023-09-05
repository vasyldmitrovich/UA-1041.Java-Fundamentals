package com.softserve.edu12.hw.task2;

public class App {
    public static void main(String[] args) {
        final int start = -100;
        final int end = 100;
        try {
            for (int i = 0; i < 10; i++) {
                Methods.readNumber(start, end);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
