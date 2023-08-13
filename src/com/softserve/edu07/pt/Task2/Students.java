package com.softserve.edu07.pt.Task2;

public class Students extends Person{
    private static final String TYPE_PERSON="Students";

    public Students(String name) {
        super(name);
    }


    @Override
    void print() {
        System.out.println("I am a "+TYPE_PERSON);
        System.out.println("My name is "+name);
        System.out.println();
    }
}
