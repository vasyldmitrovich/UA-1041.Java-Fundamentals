package com.softserve.edu07.practicaltasks2;

public abstract class Staff extends Person {
    private int salary;

    protected Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    protected int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    protected abstract void salary();
}
