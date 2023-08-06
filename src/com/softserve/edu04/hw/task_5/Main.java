package com.softserve.edu04.hw.task_5;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Jack", Breed.BOXER, 3),
                new Dog("Alex", Breed.CHIHUAHUA, 4),
                new Dog("Franck", Breed.PUG, 2),
                new Dog("Lui", Breed.LABRADOR, 3)

        };
        checkDoubleName(dogs);
        System.out.println("the oldest dog is " + checkOldestDog(dogs));

    }


    public static void checkDoubleName(Dog[] dogs) {
        String name = null;
        for (int i = 0; i < dogs.length - 1; i++) {
            name = dogs[i].getName();
            if (name.equals(dogs[i + 1].getName())) {
                System.out.println("there are dogs with the same name: " + name);
                break;
            } else {
                name = null;
            }
        }
        if (name == null) {
            System.out.println("there are NO dogs with the same name!");
        }

    }

    private static Dog checkOldestDog(Dog[] dogs) {
        Arrays.sort(dogs, Comparator.comparing(
                Dog::getAge
        ));
        return dogs[dogs.length - 1];
    }

}
