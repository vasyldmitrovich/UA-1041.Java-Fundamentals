package com.softserve.edu06.hw.task_1;

public class Eagle extends FlyingBird {

    public Eagle() {
    }

    public Eagle(String name) {

        super(name, "brown", true);
    }

    @Override
    public void fly() {
        System.out.print(this.getName());
        super.fly();
    }

    @Override
    public String toString() {
        return this.getName() + ": " + super.toString();
    }
}
