package com.softserve.edu07.Practica.task1;

public final class Cat implements Animals {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void voice() {
        System.out.println("Mяу!");
    }

    @Override
    public void feed() {
        System.out.println("П'є молоко!");

    }
}
