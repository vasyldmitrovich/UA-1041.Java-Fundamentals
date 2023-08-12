package com.softserve.edu06.hw.task_1;

public class Penguin extends NonFlyingBird {
    public Penguin() {
    }

    public Penguin(String name) {

        super(name, "black anf white", true);
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
