package com.softserve.edu07.pt.task2;

public class Student extends Person{
    private final String TYPE_PERSON = "STUDENT";
    public Student(String name) {
        super(name);
        System.out.println("Type person: " + TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.format("I\'m a student %s\n", name);
    }
}
