package com.softserve.edu07.pt.task_1;

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
        System.out.println("meow!");
    }

    @Override
    public void feed() {
        System.out.println("to eat fish!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
