package com.softserve.edu07.pt.Task1;

public class Cat implements Animal {

    private final int age;
    private final String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("MEOW MEOW!");
    }

    @Override
    public void feed() {
        System.out.println(this.name + " thank you for this fish");
    }
}
