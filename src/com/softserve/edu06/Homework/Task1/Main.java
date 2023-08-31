package com.softserve.edu06.Homework.Task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true,true),
                new Kiwi(true,true),
                new Penguin(true,true),
                new Swallow(true,true)
        };

        for (var bird: birds) {
            System.out.println(bird);
            bird.fly();

        }
    }
}
