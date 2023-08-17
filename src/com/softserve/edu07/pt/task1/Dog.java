package com.softserve.edu07.pt.task1;

public class Dog implements Animal{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.format("Dog %s is barking!\n", name);
    }

    @Override
    public void feed() {
        System.out.format("Dog %s wants to eat!\n", name);
    }
}
