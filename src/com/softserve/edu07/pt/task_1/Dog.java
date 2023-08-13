package com.softserve.edu07.pt.task_1;

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
        System.out.println("woof!");
    }

    @Override
    public void feed() {
        System.out.println("to eat meat!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
