package com.softserve.edu07.pt.work1;

public class Main {
    public static void main(String[] args) {
        Animal[] Pets = new Animal[] {
                new Dog(),
                new Dog(),
                new Cat(),
                new Cat()
        };

        for(var animals : Pets) {
            animals.voice();
            animals.feed();
        }
    }
}

