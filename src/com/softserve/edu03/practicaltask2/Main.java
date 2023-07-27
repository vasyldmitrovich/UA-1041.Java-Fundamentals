package src.com.softserve.edu03.practicaltask2;

import java.util.Scanner;

import static src.com.softserve.edu03.practicaltask2.Employee.printEmployeeTotal;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        printEmployeeTotal();

        Employee worker1 = new Employee();
        Employee.promptParameters(worker1);
        printEmployeeTotal();

        Employee worker2 = new Employee();
        Employee.promptParameters(worker2);
        printEmployeeTotal();

        Employee worker3 = new Employee();
        Employee.promptParameters(worker3);
        printEmployeeTotal();

    }
}
