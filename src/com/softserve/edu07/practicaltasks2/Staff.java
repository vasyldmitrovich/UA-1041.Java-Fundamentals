package com.softserve.edu07.practicaltasks2;

public abstract class Staff extends Person {
    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    abstract void salary();
}
