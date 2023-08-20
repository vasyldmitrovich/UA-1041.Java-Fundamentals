package com.softserve.edu07.pt.task2;

public class Student extends Person {
    private final String TYPE_PERSON;

    public Student(String name) {
        super(name);
        TYPE_PERSON = "student";
    }

    @Override
    public void print() {
        System.out.println("I am " + getName() + ", " + TYPE_PERSON + ".");
    }
}
