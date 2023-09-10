package com.softserve.edu07.pt;

abstract class Person {
    String name;

    abstract void print();
}

class Student extends Person {
    final static int TYPE_PERSON = 1;

    @Override
    void print() {
        System.out.println("I am a student.");
        System.out.println("Type of person: " + TYPE_PERSON + ".");
    }
}

abstract class Staff extends Person {

    @Override
    void print() {
        System.out.println("I am a staff.");
    }

    abstract void salary();
}

class Teacher extends Staff {
    final static int TYPE_PERSON = 2;

    @Override
    void print() {
        System.out.println("I am a teacher.");
        System.out.println("Type of person: " + TYPE_PERSON + ".");
        super.print();
    }

    @Override
    void salary() {
        System.out.println("I receive the salary.");
    }
}

class Cleaner extends Staff {
    final static int TYPE_PERSON = 3;

    @Override
    void print() {
        System.out.println("I am a cleaner.");
        System.out.println("Type of person: " + TYPE_PERSON + ".");
        super.print();
    }

    @Override
    void salary() {
        System.out.println("I receive the salary.");
    }
}