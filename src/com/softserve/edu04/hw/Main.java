package com.softserve.edu04.hw;

import com.softserve.edu04.hw.Http.Errors;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu04.hw.MinAndMax.findMinAndMax;
import static com.softserve.edu04.hw.ThreeNumbers.checkIfAllNumsInRange;
import static com.softserve.edu04.util.CollectInputs.*;
import static com.softserve.edu04.util.CollectInputs.inputString;
import static com.softserve.edu04.util.WorkingWithStrings.capitalizeString;

public class Main {
    static List<Dog> petShop = new ArrayList<Dog>();
    public static void main(String[] args) {
        runProgram();
    }

    private static void runProgram() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = inputNumberInt();
            System.out.println("\nWelcome to " + numOfTask + " task\n");

            switch (numOfTask) {
                case 1 -> runFirtsTask();
                case 2 -> runSecondTask();
                case 3 -> runThirdTask();
                case 4 -> runForthTask();
                case 5 -> runFifthTask();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    private static void printList() {
        System.out.print("\nPlease choose one of the tasks :" +
                "\n\t1 - First task" +
                "\n\t2 - Second task" +
                "\n\t3 - Third task" +
                "\n\t4 - Forth task" +
                "\n\t5 - Fifth task" +
                "\n\t0 - Exit\n");
    }

    private static void runFirtsTask() {
        float firstNum = inputNumberFloat("Input first number");
        float secondNum = inputNumberFloat("Input second number");
        float thirdNum = inputNumberFloat("Input third number");

        checkIfAllNumsInRange(firstNum, secondNum, thirdNum);
    }

    private static void runSecondTask() {
        int firstNum = inputNumberInt("Input first number");
        int secondNum = inputNumberInt("Input second number");
        int thirdNum = inputNumberInt("Input third number");

        findMinAndMax(firstNum, secondNum, thirdNum);
    }

    private static void runThirdTask() {
        Errors err = new Errors();
        err.inputHttpError();
        err.outputError();
    }

    private static void runForthTask() {
        Faculty fc = new Faculty();
        intputNumOfStudents(fc);
        inputSeason(fc);
        outputNumOfStudents(fc);
        outputSeason(fc);
    }

    private static void runFifthTask() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();


        System.out.println("______________");
        fullFillDogInfo(dog1);
        System.out.println("______________");
        fullFillDogInfo(dog2);
        System.out.println("______________");
        fullFillDogInfo(dog3);
        System.out.println("______________");

        System.out.println("The oldest dog is: " + getOldestDog());
        System.out.println("Are there dogs with same names: " + hasDuplicatedNames());


    }
    public static boolean hasDuplicatedNames() {
        if (petShop == null || petShop.isEmpty()) {
            return false;
        }

        List<String> namesArray = new ArrayList<String>();

        for (Dog dog : petShop
        ) {
            String name = dog.getName();
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

    public static void fullFillDogInfo(Dog dog) {
        inputDogAge(dog);
        inputDogName(dog);
        inputBreed(dog);
        petShop.add(dog);
    }

    public static void inputDogAge(Dog dog) {
        dog.setAge(inputNumberInt("Please enter age of dog"));
    }

    public static void inputDogName(Dog dog ) {
        dog.setName(inputString("Please enter name of dog"));
    }

    public static void inputBreed(Dog dog) {
        String breed = capitalizeString(inputString("Please enter breed of dog:"));
        switch (breed) {
            case "Beagle" -> dog.setBreed( Breed.BEAGLE.getBreed());
            case "Boxer" ->  dog.setBreed( Breed.BOXER.getBreed()) ;
            case "Bulldog" ->  dog.setBreed( Breed.BULLDOG.getBreed())  ;
            case "Dachshund" ->  dog.setBreed( Breed.DACHSHUND.getBreed()) ;
            case "German Shepherd" ->  dog.setBreed(  Breed.GERMAN_SHEPHERD.getBreed()) ;
            case "Golder Retriever" ->  dog.setBreed( Breed.GOLDEN_RETRIEVER.getBreed());
            case "Labrador Retriever" ->  dog.setBreed( Breed.LABRADOR_RETRIEVER.getBreed());
            case "Poodle" ->  dog.setBreed(Breed.POODLE.getBreed());
            case "Rottweiler" ->  dog.setBreed( Breed.ROTTWEILER.getBreed()) ;
            case "Siberian Husky" ->  dog.setBreed(Breed.SIBERIAN_HUSKY.getBreed());

            default -> System.out.println("No such season");
        }
    }
    public static void intputNumOfStudents(Faculty fc) {
        fc.setNumOfStudents(inputNumberInt("Input num of students"));
    }

    public static void inputSeason(Faculty fc) {
        String season = capitalizeString(inputString("Please enter name of season"));
        switch (season) {
            case "Summer", "Літо" -> fc.setSeason( Season.SUMMER.getEngSeason());
            case "Spring", "Весна" -> fc.setSeason( Season.SPRING.getEngSeason());
            case "Winter", "Зима" -> fc.setSeason( Season.WINTER.getEngSeason());
            case "Autumn", "Осінь" -> fc.setSeason( Season.AUTUMN.getEngSeason());
            default -> System.out.println("No such season");
        }
    }

    public static void outputNumOfStudents(Faculty fc) {
        System.out.println("The number of students is: " + fc.getNumOfStudents() );
    }

    public static void outputSeason(Faculty fc) {
        switch (fc.getSeason()) {
            case "Summer", "Літо" -> System.out.println("This is beautiful hot summer");
            case "Spring", "Весна" -> System.out.println("This is blooming spring");
            case "Winter", "Зима" -> System.out.println("This is frozen winter");
            case "Autumn", "Осінь" -> System.out.println("This is mystery autumn");
            default -> System.out.println("No such season");
        }
    }
}
