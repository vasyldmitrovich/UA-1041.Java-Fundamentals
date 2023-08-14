package com.softserve.edu07.pr;

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
