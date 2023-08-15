package com.softserve.edu07.pt.work2;

public class Student extends Person {
    final String TYPE_PERSON = "student ";

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + getName());
    }
}
