package com.softserve.edu07.Practica.task2;

public class Student extends Person{

    private final String TYPE_PERSON;
    protected Student(String name) {
        super(name);
        TYPE_PERSON = "Student";
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am student\t"+name);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
