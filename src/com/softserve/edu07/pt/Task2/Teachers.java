package com.softserve.edu07.pt.Task2;

public class Teachers extends Staff{
    private static final String TYPE_PERSON="Teachers";

    public Teachers(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println(name+" is a teacher, salary: 20000");
    }

    @Override
    void print() {
        System.out.println("I am a "+TYPE_PERSON);
        System.out.println("My name is "+name);
        System.out.println();
    }
}
