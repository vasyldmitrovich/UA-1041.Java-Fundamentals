package com.softserve.edu07.pr;

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
