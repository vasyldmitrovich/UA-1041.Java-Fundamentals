package com.softserve.edu07.pt.Task2;

abstract class   Person {
    String name;//Make private

    public Person(String name) {
        this.name = name;
    }

    abstract void print();

}
