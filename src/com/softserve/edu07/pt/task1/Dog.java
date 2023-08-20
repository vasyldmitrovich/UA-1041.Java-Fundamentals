package com.softserve.edu07.pt.task1;

public class Dog implements Animal {
    @Override
    public void feed() {
        System.out.println("Meat");
    }

    @Override
    public void voice() {
        System.out.println("Bark");
    }
}
