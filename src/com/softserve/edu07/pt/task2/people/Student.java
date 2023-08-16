package com.softserve.edu07.pt.task2.people;

public class Student extends Person {

    private final String TYPE_PERSON = "student";

    public Student(String name) {
        super(name);
    }


    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + " " + getName());
    }
}
