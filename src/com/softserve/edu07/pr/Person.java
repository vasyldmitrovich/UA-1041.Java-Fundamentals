package com.softserve.edu07.pr;

abstract class Person {
    protected String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    abstract protected void printInternal();

    public void print() {
        printInternal();
    }
}

abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    abstract void salary();
}

class Student extends Person {
    static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    protected void printInternal() {
        System.out.println(String.format("I am %s %s", name, TYPE_PERSON));
    }
}

class Teacher extends Staff {
    static final String TYPE_PERSON = "Teacher";
    static final int money = 30000;

    public Teacher(String name) {
        super(name);
    }

    @Override
    protected void printInternal() {
        System.out.println(String.format("I am %s %s", name, TYPE_PERSON));
    }

    @Override
    void salary() {
        System.out.println("My salary is " + money);
    }
}

class Cleaner extends Staff {
    static final String TYPE_PERSON = "Cleaner";
    static final int money = 20000;

    public Cleaner(String name) {
        super(name);
    }

    @Override
    protected void printInternal() {
        System.out.println(String.format("I am %s %s", name, TYPE_PERSON));
    }

    @Override
    void salary() {
        System.out.println("My salary is " + money);
    }
}

class Main {
    public static void main(String[] args) {
        Person[] peopleArray = {
                new Student("Anna"),
                new Teacher("Olya"),
                new Cleaner("John"),
                new Student("Ken")
        };
        for (var person : peopleArray) {
            if (person instanceof Student) {
                person.print();
            } else {
                person.print();
                ((Staff) person).salary();
            }
        }
    }
}
