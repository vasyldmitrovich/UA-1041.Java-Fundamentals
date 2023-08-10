package com.softserve.edu07.practicaltasks1;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Cat goes \"Mew\"");
    }

    @Override
    public void feed() {
        System.out.println("Eat fish");
    }
}
