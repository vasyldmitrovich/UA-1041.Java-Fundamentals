package com.softserve.edu07.pt.task_2;

public abstract class Person {
    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    private String name;

    public abstract void print();
}
