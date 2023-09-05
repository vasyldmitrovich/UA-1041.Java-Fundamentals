package com.softserve.edu07.Practica.task2;

public abstract class Staff extends Person {
    protected Staff(String name) {
        super(name);
    }

    public abstract void salary();


    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                '}';
    }
}
