package com.softserve.edu07.practicaltasks2;

public class Teacher extends Staff {
    final String TYPE_PERSON = "teacher";
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    void print() {
        System.out.format("\nI am a %s %s", TYPE_PERSON, getName());
    }

    @Override
    void salary() {
        System.out.format("\nMy salary is %s $", salary);
    }
}
