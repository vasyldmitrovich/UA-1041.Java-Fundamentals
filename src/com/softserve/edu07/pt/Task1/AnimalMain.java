package com.softserve.edu07.pt.Task1;

public class AnimalMain {
    static int lengthOfLine = 20;
    static Animal[] animals = {
            new Dog(12, "Bobik"),
            new Dog(3, "Ram"),
            new Dog(6, "Sharick"),
            new Cat(8, "Murchik"),
            new Cat(3, "Kotik"),
            new Cat(5, "Bulochka")
    };

    public static void main(String[] args) {
        printAllAnimals();
    }

    public static void printAllAnimals() {
        for (var animal : animals
        ) {
            System.out.println("-".repeat(lengthOfLine));
            animal.voice();
            animal.feed();
            System.out.println("-".repeat(lengthOfLine));
        }
    }
}
