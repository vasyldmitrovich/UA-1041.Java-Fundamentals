package com.softserve.edu06.hw.task1;

public class TaskMain {
    public static void main(String[] args) {
        Bird[] birds = {
            new Eagle("Brown and white", true),
                new Swallow("White and dark blue", true),
                new Penguin("Black and white", true),
                new Kiwi("Brown", true)
        };
        for (Bird bird : birds){
            System.out.println(bird);
            bird.fly();
        }
    }
}
