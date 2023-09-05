package com.softserve.edu07.Practica.task2;

public class Cleaner extends Staff {
    protected Cleaner(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am a cleaner");

    }

    @Override
    public void salary() {
        System.out.println("I have a salary for cleaning");
    }
}
