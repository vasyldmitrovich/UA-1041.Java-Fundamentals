package com.softserve.edu07.pt.Task2;

public class Cleaners extends Staff{
    private static final String TYPE_PERSON="Cleaners";

    public Cleaners(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println(getName()+" is a cleaners, salary : 15000");
    }

    @Override
    void print() {
        System.out.println("I am a "+TYPE_PERSON);
        System.out.println("My name is "+getName());
        System.out.println();
    }
}
