package com.softserve.edu07.pr;

public interface Animal {
    void voice();

    void feed();

}

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("The cat is no longer hungry");
    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("The dog is no longer hungry");
    }
}

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
