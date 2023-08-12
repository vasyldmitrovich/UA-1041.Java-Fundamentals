package com.softserve.edu06.hw.task1;

public class Task1 {

    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Fierce"),
                new Swallow("Colorful"),
                new Penguin("White and black"),
                new Kiwi("Brown")
        };

        for (var bird : birds) bird.fly();
    }
}
