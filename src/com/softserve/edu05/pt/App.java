package com.softserve.edu05.pt;

import com.softserve.edu05.util.CollectInputs;

import java.util.ArrayList;
import java.util.Comparator;

import static com.softserve.edu04.util.CollectInputs.inputNumberInt;
import static com.softserve.edu05.pt.Task1.runTask1;
import static com.softserve.edu05.pt.Task2.runTask2;
import static com.softserve.edu05.pt.Task3.runTask3;
import static com.softserve.edu05.util.RandNums.randInt;

public class App {
    static ArrayList<Employee> office = new ArrayList<Employee>();
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
    public static void runTask4() {
        Employee e1 = new Employee("Ivan", randInt(1, 4), randInt(100, 500));
        Employee e2 = new Employee("Grisha", randInt(1, 4), randInt(100, 500));
        Employee e3 = new Employee("Ann", randInt(1, 4), randInt(100, 500));
        Employee e4 = new Employee("Misha", randInt(1, 4), randInt(100, 500));
        Employee e5 = new Employee("Dasha", randInt(1, 4), randInt(100, 500));

        System.out.println("\nDefault office:\n");
        printOffice();

        printWorkersOfSpecialDept();

        office.sort(Comparator.comparing(
                Employee::getSalary
        ).reversed());
        System.out.println("\nSorted by salary office:\n");
        printOffice();
    }

    private static void printOffice() {
        for (Employee e : office
        ) {
            System.out.println(e);
        }
    }

    private static void printWorkersOfSpecialDept() {
        int dept = CollectInputs.inputNumberInt("\nPlease enter which department you want to print");
        for (Employee e : office
        ) {
            if (e.getDeptNum() == dept) {
                System.out.println(e);
            }
        }
    }

}