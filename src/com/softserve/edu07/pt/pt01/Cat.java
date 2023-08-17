package com.softserve.edu07.pt.pt01;

public class Cat implements Animal{
    private String name;

    public Cat() {
    }

    public Cat(String name) {
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
        System.out.println("say meow");
    }

    @Override
    public void feed() {
        System.out.println("like milk");
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
