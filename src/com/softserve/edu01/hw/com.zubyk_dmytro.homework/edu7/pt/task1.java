package edu7.pt;

// Interface Animal
interface Animal {
    void voice();

    void feed();
}

// Class Cat implementing Animal
class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating.");
    }
}

// Class Dog implementing Animal
class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating.");
    }
}

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

