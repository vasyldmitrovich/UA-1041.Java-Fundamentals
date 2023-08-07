package com.softserve.edu06.hm;

public class BirdMain {
    public static void main(String[] args) {
        Bird[] Bird = {
                new Eagle("white", true),
                new Sparrow("brown", true),
                new Penguin("black/white", true),
                new Kiwi("brown", true)
        };
        for (var bird : Bird) {
            System.out.println(bird);
            bird.fly();
        }
    }
}
