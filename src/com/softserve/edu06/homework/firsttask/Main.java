package com.softserve.edu06.homework.firsttask;

public class Main {
    public static void main(String[] args) {
        Bird[] animals = new Bird[]{
                new Eagle("Eagle", "brown feather", true),
                new Swallow("Swallow", "black and white feather", true),
                new Penguin("Penguin", "black and white feather", true),
                new Kiwi("Kiwi", "brown feather", true)
        };

        for (var birds : animals) {
            System.out.println(birds);
            birds.fly();
        }
    }
}
