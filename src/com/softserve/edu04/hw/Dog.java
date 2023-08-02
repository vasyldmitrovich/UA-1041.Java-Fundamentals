package com.softserve.edu04.hw;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu04.util.CollectInputs.inputNumberInt;
import static com.softserve.edu04.util.CollectInputs.inputString;
import static com.softserve.edu04.util.WorkingWithStrings.capitalizeString;

public class Dog {
    static List<Dog> petShop = new ArrayList<Dog>();
    private int age;
    private String breed;
    private String name;

    public Dog() {

    }

    public Dog(int age, String breed, String name) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        petShop.add(this);
    }

    public static boolean hasDuplicatedNames() {
        if (petShop == null || petShop.isEmpty()) {
            return false;
        }

        List<String> namesArray = new ArrayList<String>();

        for (Dog dog : petShop
        ) {
            String name = dog.name;
            if (namesArray.contains(name)) {
                return true;
            }
            namesArray.add(name);
        }

        return false;
    }

    public static Dog getOldestDog() {
        int maxAge = 0;
        Dog oldestDog = null;
        for (var dog : petShop
        ) {
            if (dog.getAge() > maxAge) {
                oldestDog = dog;
                maxAge = dog.getAge();
            }
        }
        return oldestDog;
    }

    public void fullFillDogInfo() {
        inputAge();
        inputName();
        inputBreed();
        petShop.add(this);
    }

    public void inputAge() {
        this.age = inputNumberInt("Please enter age of dog");
    }

    public void inputName() {
        this.name = inputString("Please enter name of dog");
    }

    public void inputBreed() {
        String breed = capitalizeString(inputString("Please enter breed of dog:"));
        switch (breed) {
            case "Beagle" -> this.breed = Breed.BEAGLE.getBreed();
            case "Boxer" -> this.breed = Breed.BOXER.getBreed();
            case "Bulldog" -> this.breed = Breed.BULLDOG.getBreed();
            case "Dachshund" -> this.breed = Breed.DACHSHUND.getBreed();
            case "German Shepherd" -> this.breed = Breed.GERMAN_SHEPHERD.getBreed();
            case "Golder Retriever" -> this.breed = Breed.GOLDEN_RETRIEVER.getBreed();
            case "Labrador Retriever" -> this.breed = Breed.LABRADOR_RETRIEVER.getBreed();
            case "Poodle" -> this.breed = Breed.POODLE.getBreed();
            case "Rottweiler" -> this.breed = Breed.ROTTWEILER.getBreed();
            case "Siberian Husky" -> this.breed = Breed.SIBERIAN_HUSKY.getBreed();

            default -> System.out.println("No such season");
        }
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
