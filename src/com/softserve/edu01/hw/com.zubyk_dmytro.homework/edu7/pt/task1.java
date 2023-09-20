package edu7.pt;

public class task1 {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[4];

        // Create instances of Cat and Dog and add them to the array
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        // Call voice() and feed() methods for each animal
        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}

