package com.softserve.edu07.Practica.task1;

public class Main {
    public static void main (String[] args) {

        Animals[] animals = {
                new Cat("Neo"),
                new Dog("Kleo"),
                new Cat("Leo"),
                new Dog("Umka")
        };
        for (var animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println(animal);

        }

    }
}
