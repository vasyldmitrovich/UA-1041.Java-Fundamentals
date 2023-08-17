package com.softserve.edu07.pt.task1;

public class Appl {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Tom"),
                new Dog("Barsik"),
                new Cat("Kex"),
                new Dog("Lyik")
        };

        for(Animal a : animals){
            a.voice();
            a.feed();
        }
    }
}