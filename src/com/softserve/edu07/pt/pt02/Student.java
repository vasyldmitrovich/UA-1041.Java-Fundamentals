package com.softserve.edu07.pt.pt02;

public class Student extends Person {
    static final private String TYPE_PERSON = "student";

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("My name is " + getName() + ", i am a " + TYPE_PERSON);
    }
}
