package com.softserve.edu07.pt.task2;

public class Teacher extends Staff{
    private final String TYPE_PERSON = "TEACHER";
    public Teacher(String name) {
        super(name);
        System.out.println("Type person: " + TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.format("I\'m a teacher %s\n", name);
    }

    @Override
    void salary() {
        System.out.println("I\'m a teacher, so I have a salary");
    }
}
