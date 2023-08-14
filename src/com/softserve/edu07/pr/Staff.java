package com.softserve.edu07.pr;

abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    abstract void salary();
}
