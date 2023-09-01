package com.softserve.edu07.Practica.task1;

public class Dog implements Animals {

   private final String name;

    public Dog (String name){
        this.name = name;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    @Override
    public void feed() {
        System.out.println("Їсть м'ясо!");

    }
}
