package com.softserve.edu07.practicaltasks2;

public abstract class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void print();//Do not need to write word abstract, method will be abstract by default
}
