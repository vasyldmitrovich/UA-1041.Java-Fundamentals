package com.softserve.edu06.hw.task_1;

public class Kiwi extends NonFlyingBird {
    public Kiwi() {
    }

    public Kiwi(String name) {

        super(name, "gray", true);
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
