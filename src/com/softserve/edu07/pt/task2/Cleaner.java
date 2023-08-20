package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {
    private final String TYPE_PERSON;

    public Cleaner(String name, int salary) {
        super(name, salary);
        TYPE_PERSON = "cleaner";
    }


    @Override
    public void print() {
        System.out.print("I am " + getName() + ", " + TYPE_PERSON + ".");
    }

    @Override
    public void salary() {
        System.out.println(" My salary is: " + getSalary());
    }
}
