package com.softserve.edu07.pt.task2;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void print();
}
