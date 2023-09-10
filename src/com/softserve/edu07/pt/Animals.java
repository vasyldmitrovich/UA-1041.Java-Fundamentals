package com.softserve.edu07.pt;

public interface Animals {
    void voice();

    void feed();
}

class Cat implements Animals {
    @Override
    public void voice() {
        System.out.println("The cat says meow.");
    }

    @Override
    public void feed() {
        System.out.println("The cat eats cat food.");
    }
}

class Dog implements Animals {
    @Override
    public void voice() {
        System.out.println("The dog barks.");
    }

    @Override
    public void feed() {
        System.out.println("The dog gnaws the bone.");
    }
}
