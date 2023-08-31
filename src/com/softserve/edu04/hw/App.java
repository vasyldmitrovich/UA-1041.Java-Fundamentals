package com.softserve.edu04.hw;

import java.util.Scanner;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // Task 1

        System.out.println("Task1");

        Task01 result1 = new Task01();
        float num11 = Task01.inputFloatNumber();
        float num12 = Task01.inputFloatNumber();
        float num13 = Task01.inputFloatNumber();

        Task01.getCountOddNumbers();
        System.out.println();

        // Task 2
        System.out.println("Task2");

        Task02 result2 = new Task02();
        int num21 = Task02.getNumber();
        int num22 = Task02.getNumber();
        int num23 = Task02.getNumber();

        System.out.println("Maximum value from numbers (" + num21 + ", " + num22 + ", " + num23 + ") is "
                +Math.max(Math.max(num21, num22), num23));
        System.out.println("Minimum value from numbers (" + num21 + ", " + num22 + ", " + num23 + ") is "
                +Math.min(Math.min(num21, num22), num23));

        System.out.println();

        // Task 3
        System.out.println("Task3");

        System.out.println("I can't understand, why it doesn't work.");

        HTTPErrors result3 = new HTTPErrors();
      //  String errorNumber = HTTPErrors.();
     //   HTTPErrors.getNameOfError;
        System.out.println();

        // Task 4
        System.out.println("Task4");

        Faculty.inputDates();
        System.out.println("I don't not understand what needs to check.");
        System.out.println();

        // Task 5
        System.out.println("Task 5");

        Dog dog1 = new Dog();
        Dog.inputDates(dog1);

        int oldestDog = dog1.age;
        String nameOfOldestDog = dog1.name;
        String breedOfOldestDog = dog1.breed;

        Dog dog2 = new Dog();
        Dog.inputDates(dog2);

        if (dog2.equals(dog1)==false) {
            if (oldestDog < dog2.age) {
                oldestDog = dog2.age;
                nameOfOldestDog = dog2.name;
                breedOfOldestDog = dog2.breed;
            }
        } else {
            System.out.println("The dog " + dog2.name + " is already entered in the database.\n");
        }

        Dog dog3 = new Dog();
        Dog.inputDates(dog3);

        if (dog3.equals(dog1)==false && dog3.equals(dog2)==false) {
            if (oldestDog < dog3.age) {
                oldestDog = dog3.age;
                nameOfOldestDog = dog3.name;
                breedOfOldestDog = dog3.breed;
            }
        } else {
            System.out.println("The dog " + dog3.name + " is already entered in the database.\n");
        }

        System.out.println("The oldest dog is " + breedOfOldestDog + " " +
                nameOfOldestDog + ".");
    }
}
