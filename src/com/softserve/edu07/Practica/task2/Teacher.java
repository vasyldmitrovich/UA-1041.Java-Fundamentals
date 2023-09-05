package com.softserve.edu07.Practica.task2;

public class Teacher extends Staff {
    private final String TYPE_PERSON;
    protected Teacher(String name) {
        super(name);
        TYPE_PERSON = "Teacher";
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am teacher\t"+name);

    }

    @Override
    public void salary() {
        System.out.println("I have salary for teaching");

    }
}
