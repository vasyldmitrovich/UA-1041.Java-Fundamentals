package com.softserve.edu07.pt.Task2;

public class Teacher extends Staff {
    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a teacher");
    }

    @Override
    public void salary() {
        System.out.println("I'm getting 1200$ as a teacher");
    }

}
