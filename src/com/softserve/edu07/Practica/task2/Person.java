package com.softserve.edu07.Practica.task2;

public abstract class Person {
    protected String name;

    protected Person(String name) {
        this.name = name;
    }

    abstract void print();



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}


