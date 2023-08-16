package com.softserve.edu07.pt.task2.people;

public class Cleaner extends Staff{

    private final String TYPE_PERSON = "cleaner";


    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + " " + getName());
    }

    @Override
    public void salary() {
        System.out.println("CLeaner " + getName() + " has salary");
    }
}
