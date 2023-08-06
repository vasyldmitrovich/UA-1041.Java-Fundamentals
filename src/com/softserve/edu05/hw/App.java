package com.softserve.edu05.hw;

import com.softserve.edu05.hw.Task1.FiveIntegers;
import com.softserve.edu05.hw.Task1.MonthsDays;
import com.softserve.edu05.hw.Task1.TenIntegers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static com.softserve.edu04.util.CollectInputs.*;

public class App {
    static ArrayList<Car>  garage = new ArrayList<>();
    public static void main(String[] args) {
        runProgram();
    }
//In this and anotreh class all good
    private static void runProgram() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = inputNumberInt();
            System.out.println("\nWelcome to " + numOfTask + " task\n");

            switch (numOfTask) {
                case 1 -> runTask1_1();
                case 2 -> runTask1_2();
                case 3 -> runTask1_3();
                case 4 -> runTask2();
                case 5 -> runTaks3();
                case 6 -> System.out.println();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    private static void printList() {
        System.out.print("\nPlease choose one of the tasks :" +
                "\n\t1 - 1.1 task" +
                "\n\t2 - 1.2 task" +
                "\n\t3 - 1.3 task" +
                "\n\t4 - 2 task" +
                "\n\t5 - 3 task" +
                "\n\t6 - 4 task" +
                "\n\t0 - Exit\n");
    }

    static void runTask1_1() {
        MonthsDays md = new MonthsDays();
        md.setNumOfMonth();
        md.howMuchDaysInMonth();
    }

    static void runTask1_2() {
        TenIntegers ti1 = new TenIntegers();
        ti1.fullfillTenIntArray();
        ti1.outputResults();
    }

    static void runTask1_3() {
        FiveIntegers fi1 = new FiveIntegers();
        fi1.fullfillFiveIntArray();
        System.out.println("Position of second positive: " + fi1.positionOfSecondPositive());
        System.out.println("Min value: " + fi1.getFiveIntArr()[fi1.smallestValueIndex()] +
                "\nMin value index: " + fi1.positionOfSecondPositive());
        System.out.println("Production of even numbers: " + fi1.productionOfEvens());
    }
    static void runTaks3(){
        Car car1 = new Car("Wagon",2018,3000);
        Car car2 = new Car("Crossover",2015,2000);
        Car car3 = new Car("Sedan",2017,2500);
        garage.add(car1);
        garage.add(car2);
        garage.add(car3);
        printCertainModelYears();
        printSortedByYear();
    }
    static void printCertainModelYears(){
        int year = inputNumberInt("Please enter a year");
        for (Car car:garage
             ) {
            if(car.getYear()==year){System.out.println(car);}
        }
    }
    static void printSortedByYear(){
        ArrayList<Car> copiedGarage = new ArrayList<>();
        Collections.copy(copiedGarage,garage);
        copiedGarage.sort(Comparator.comparing(
                Car::getYear
        ));
        for (Car car:copiedGarage
             ) {
            System.out.println(car);
        }

    }
    static void runTask2(){
        boolean condition = true;
        do{
            int num1 = inputNumberInt("Input first num:");
            int num2 = inputNumberInt("Input second num:");
            System.out.format("%d + %d = %d",num1,num2,(num1+num2));
            switch (inputString("Do you want to continue:Y/N")){
                case "Yes","Y" -> System.out.println("Lets continue");
                case "No","N" -> {
                    System.out.println("Exit");
                    condition=false;
                }
                default -> {
                    System.out.println("No such operation");
                    condition=false;
                }
            }
        }while(true);
    }
}
