package com.softserve.edu07.pr;

abstract class Person {
    protected String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    abstract protected void printInternal();

    public void print() {
        printInternal();
    }
}

