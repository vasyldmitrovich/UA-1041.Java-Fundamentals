package com.softserve.edu07.pt.Task1;

public class Dog implements Animal {
    private final int age;//The same is here
    private final String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("WOOF WOOF");
    }

    @Override
    public void feed() {
        System.out.println(this.name + " thanks you for this bone");
    }
}
