package com.softserve.edu04.hw;

import com.softserve.edu04.hw.Http.Errors;



import static com.softserve.edu04.util.CollectInputs.inputNumberFloat;
import static com.softserve.edu04.util.CollectInputs.inputNumberInt;
import static com.softserve.edu04.hw.ThreeNumbers.*;
import static com.softserve.edu04.hw.MinAndMax.*;
public class Main {
    public static void main(String[] args) {
        runProgram();
    }
    private static void runProgram () {
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
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }
    private static void printList () {
        System.out.print("\nPlease choose one of the tasks :" +
                "\n\t1 - First task" +
                "\n\t2 - Second task" +
                "\n\t3 - Third task" +
                "\n\t4 - Forth task" +
                "\n\t5 - Fifth task" +
                "\n\t0 - Exit\n");
    }
    private static void runFirtsTask(){
        float firstNum = inputNumberFloat("Input first number");
        float secondNum = inputNumberFloat("Input second number");
        float thirdNum = inputNumberFloat("Input third number");

        checkIfAllNumsInRange(firstNum,secondNum,thirdNum);
    }
    private static void  runSecondTask(){
        int firstNum = inputNumberInt("Input first number");
        int secondNum = inputNumberInt("Input second number");
        int thirdNum = inputNumberInt("Input third number");

        findMinAndMax(firstNum,secondNum,thirdNum);
    }
    private static void runThirdTask(){
        Errors err = new Errors();
        err.inputHttpError();
        err.outputError();
    }
}
