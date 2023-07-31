package com.softserve.edu04.hw.task5;

public class Dog {
    private String name;

    enum Breed {
        SHEPARD, LABRADOR, MALAMUTE
    }

    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void checkName(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");
        }
    }

    public static void getOldest(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog is: " + dog1.getName() + ", " + Breed.LABRADOR);
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog is: " + dog2.getName() + ", " + Breed.SHEPARD);
        } else {
            System.out.println("The oldest dog is: " + dog3.getName() + ", " + Breed.MALAMUTE);
        }
    }
}







