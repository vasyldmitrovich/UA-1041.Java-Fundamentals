package com.softserve.edu07.pt.Task2;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a cleaner");
    }

    @Override
    public void salary() {
        System.out.println("I'm getting 1000$ as a cleaner");
    }

}
