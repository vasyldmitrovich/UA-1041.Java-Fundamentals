package com.softserve.edu04.hw;

public class Dog {
    private int age;
    private String breed;
    private String name;

    public Dog() {

    }

    public Dog(int age, String breed, String name) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
