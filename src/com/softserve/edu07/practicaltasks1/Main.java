package com.softserve.edu07.practicaltasks1;

public class Main {
    public static void main(String[] args) {

        Animal[] pets = new Animal[]{
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat()
        };

        for(var animals : pets){
            animals.voice();
            animals.feed();
        }
    }
}
