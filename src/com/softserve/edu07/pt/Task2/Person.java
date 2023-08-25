package com.softserve.edu07.pt.Task2;

abstract class   Person {
    private String name;//Make private

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void print();

}
