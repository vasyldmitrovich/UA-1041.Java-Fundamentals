package com.softserve.edu07.pt.work2;

public abstract class Staff extends Person {
    private int salary;

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public abstract void salary();//This method should go after getters and setters and do not need to write public abstract

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
