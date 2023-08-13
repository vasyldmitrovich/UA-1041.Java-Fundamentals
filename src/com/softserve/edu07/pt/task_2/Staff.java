package com.softserve.edu07.pt.task_2;

public abstract class Staff extends Person {
    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a Staff");
    }

    public abstract void salary();
}
