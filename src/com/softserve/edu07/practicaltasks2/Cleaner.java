package com.softserve.edu07.practicaltasks2;

public class Cleaner extends Staff {

    final String TYPE_PERSON = "cleaner";

    protected Cleaner(String name, int salary) {
        super(name, salary);
    }

    @Override
    protected void print() {
        System.out.format("\nI am a %s %s", TYPE_PERSON, getName());
    }

    @Override
    protected void salary() {
        System.out.format("\nMy salary is %s $", getSalary());
    }
}
