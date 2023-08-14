package com.softserve.edu07.pr;

class AnimalMain {
    public static void main(String[] args) {
        Animal[] animalArray = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog()
        };
        for (var animal : animalArray) {
            animal.feed();
            animal.voice();
        }
    }
}
