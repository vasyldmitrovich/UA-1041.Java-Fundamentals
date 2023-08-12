package com.softserve.edu07.practicaltasks2;

public class Student extends Person {

    final String TYPE_PERSON = "student";

    public Student() {
    }

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.format("\nI am a %s %s", TYPE_PERSON, getName());
    }
}
