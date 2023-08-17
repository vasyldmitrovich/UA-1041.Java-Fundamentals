package com.softserve.edu07.pt.pt02;

public abstract class Staff extends Person {


    public Staff(String name) {
        super(name);
    }

    @Override
    void print() {
    }

    abstract void salary();
}
