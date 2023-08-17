package com.softserve.edu07.pt.pt01;

public class Dog implements Animal{
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("say woof");
    }

    @Override
    public void feed() {
        System.out.println("like bones");
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}
