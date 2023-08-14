package com.softserve.edu07.pr;

class Student extends Person {
    static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    protected void printInternal() {
        System.out.println(String.format("I am %s %s", name, TYPE_PERSON));
    }
}
