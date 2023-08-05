package com.softserve.edu05.hw;

import com.softserve.edu05.hw.Task1.FiveIntegers;
import com.softserve.edu05.hw.Task1.MonthsDays;
import com.softserve.edu05.hw.Task1.TenIntegers;

import static com.softserve.edu04.util.CollectInputs.inputNumberInt;

public class App {
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
                case 4 -> System.out.println();
                case 5 -> System.out.println();
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
}
