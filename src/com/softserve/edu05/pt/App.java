package com.softserve.edu05.pt;

import static com.softserve.edu04.util.CollectInputs.inputNumberInt;
import static com.softserve.edu05.pt.Employee.runTask4;
import static com.softserve.edu05.pt.Task1.runTask1;
import static com.softserve.edu05.pt.Task2.runTask2;
import static com.softserve.edu05.pt.Task3.runTask3;

public class App {
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
                case 1 -> runTask1();
                case 2 -> runTask2();
                case 3 -> runTask3();
                case 4 -> runTask4();
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
                "\n\t0 - Exit\n");
    }
}