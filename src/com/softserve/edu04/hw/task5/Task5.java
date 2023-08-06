package com.softserve.edu04.hw.task5;

import java.util.Arrays;
import java.util.Comparator;

public class Task5 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sheyh", Breed.AKITA, 2);
        Dog d2 = new Dog("Homs", Breed.BLOODHOUND, 6);
        Dog d3 = new Dog("Folm", Breed.BULLDOG, 10);
        Dog d4 = new Dog("Bars", Breed.LABRADOR, 12);
        Dog d5 = new Dog("Bars", Breed.AKITA, 7);

        checkSameName(d1, d2, d3, d4, d5);

        Dog oldestDog = findOldestDog(d1, d2, d3, d4, d5);
        System.out.format("The oldest dog\nname: %s\nbreed: %s\n", oldestDog.getName(), oldestDog.getBreed());
    }

    public static Dog findOldestDog(Dog... dogs){
        return Arrays.stream(dogs).max(Comparator.comparing(Dog::getAge)).get();
    }

    public static void checkSameName(Dog... dogs){
        for (int i = 0; i < dogs.length - 1; i++){
            if(dogs[i].equals(dogs[i + 1])){
                System.out.println("===================");
                System.out.println(dogs[i]);
                System.out.println(dogs[i + 1]);
                System.out.println("have same names");
                System.out.println("===================");
            }
        }
    }


}
