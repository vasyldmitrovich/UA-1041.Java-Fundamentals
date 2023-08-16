package com.softserve.edu07.pt.task1;

public class Cat implements Animal {


    @Override
    public void voice() {
        System.out.println("Meow-meow");
    }

    @Override
    public void feed() {

        System.out.println("Cat is eating");
    }
}
