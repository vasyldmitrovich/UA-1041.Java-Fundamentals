package com.softserve.edu07.pt.task2.people;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
