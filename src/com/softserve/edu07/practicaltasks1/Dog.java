package com.softserve.edu07.practicaltasks1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Dog goes \"Woof\"");
    }

    @Override
    public void feed() {
        System.out.println("Eat bone");
    }
}
