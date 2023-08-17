package com.softserve.edu07.pt.pt02;

public class Teacher extends Staff {
    static private final String TYPE_PERSON = "teacher";

    public Teacher(String name) {
        super(name);
    }


    @Override
    void print() {
        System.out.println("My name is " + getName() + ", i am a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("My salary is ₴ 17000 ");
    }
}
