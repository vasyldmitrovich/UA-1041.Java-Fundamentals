package com.softserve.edu06.hw.hw01;

public class MainBird {//All is good
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Eagle","Brown feathers", "lays 1-4 eggs"),
                new Sparrow("Sparrow", "Grey-brown feathers", "lays 4-5 eggs"),
                new Penguin("Penguin", "Black and white feathers", "lays 1-2 eggs"),
                new Kiwi("Kiwi", "Brown feathers", "lays 1-2 eggs")
        };
        for (Bird bird: birds) {
            System.out.println(bird);
            bird.fly();
        }
    }
}
