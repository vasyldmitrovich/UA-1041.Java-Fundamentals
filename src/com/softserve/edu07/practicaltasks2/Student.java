package com.softserve.edu07.practicaltasks2;

public class Student extends Person {

    final String TYPE_PERSON = "student";

    protected Student(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.format("\nI am a %s %s", TYPE_PERSON, getName());
    }
}
