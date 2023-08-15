package com.softserve.edu07.pt.work2;

public class Teacher extends Staff {
    final String TYPE_PERSON = "teacher ";

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + getName());
    }

    @Override
    public void salary() {
        System.out.println("My salary is $" + getSalary());
    }

    //Constructor should go after fields
    public Teacher(String name, int salary) {
        super(name, salary);
    }
}
