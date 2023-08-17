package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON = "CLEANER";
    public Cleaner(String name) {
        super(name);
        System.out.println("Type person: " + TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.format("I\'m a cleaner %s\n", name);
    }

    @Override
    void salary() {
        System.out.println("I\'m a cleaner, so I have a salary");
    }
}
