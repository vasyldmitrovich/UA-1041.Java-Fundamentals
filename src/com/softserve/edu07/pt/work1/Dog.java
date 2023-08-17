package com.softserve.edu07.pt.work1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Dog does \"Woof\"");
    }

    @Override
    public void feed() {
        System.out.println("Dog eats meat");
    }
}
