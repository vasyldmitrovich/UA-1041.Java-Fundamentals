package com.softserve.edu07.pt.task_2;

public class Student extends Person {
    public Student() {
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a Student");
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}
