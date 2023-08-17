package com.softserve.edu07.pt.task1;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.format("Cat %s said \'May\'\n", name);
    }

    @Override
    public void feed() {
        System.out.format("Cat %s wants to eat!\n", name);
    }
}
