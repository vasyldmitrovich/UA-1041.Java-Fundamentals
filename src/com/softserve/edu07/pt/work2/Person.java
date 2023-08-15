package com.softserve.edu07.pt.work2;

public abstract class Person {
    public String name;
    abstract void print();//Move at the end of class

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
