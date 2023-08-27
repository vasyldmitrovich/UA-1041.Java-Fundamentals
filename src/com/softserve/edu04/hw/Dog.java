package com.softserve.edu04.hw;

import java.util.Objects;

import static com.softserve.edu04.hw.App.SCANNER;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void inputDates(Dog dog) {
        System.out.print("Input the name of the dog: ");
        String dogName = SCANNER.nextLine();
        System.out.print("Input the breed of " + dogName + ": ");
        String dogBreed = SCANNER.nextLine();
        System.out.print("Input the age of " + dogName + ": ");
        int dogAge = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public enum DogsBreed {
        TERRIER, BULLDOG, SPANIEL
    }
}
