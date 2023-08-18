package com.softserve.edu07.pt.Task1;

public class Cat implements Animal {

    private final int age;//Why fields final???? If you do field final naming should be uppercase
    private final String name;//But this fields should not be final

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
