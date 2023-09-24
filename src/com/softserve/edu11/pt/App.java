package com.softserve.edu11.pt;

public class App {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        System.out.print("Input sentences: ");
        var s1 = com.softserve.edu10.pt.Task_1.getName();
        System.out.print("Input word for checking in previous sentences: ");
        var s2 = com.softserve.edu10.pt.Task_1.getName();
        Task_1.compareStrings(s1, s2);

        //Task 2
        System.out.println("Task 2");
        System.out.print("Input last name: ");
        var lastName = com.softserve.edu10.pt.Task_1.getName();
        System.out.print("Input first name: ");
        var firstName = com.softserve.edu10.pt.Task_1.getName();
        System.out.print("Input middle name: ");
        var middleName = com.softserve.edu10.pt.Task_1.getName();
        Task_2.printNames(lastName, firstName, middleName);
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        System.out.println("Input users name");
        Task_3.message();
    }
}
