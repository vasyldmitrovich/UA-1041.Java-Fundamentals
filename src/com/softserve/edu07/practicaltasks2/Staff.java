package com.softserve.edu07.practicaltasks2;

public abstract class Staff extends Person {
    private int salary;

    public Staff() {
    }

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    abstract void salary();
}
