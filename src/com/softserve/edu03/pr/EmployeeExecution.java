package com.softserve.edu03.pr;


import java.util.Scanner;

public class EmployeeExecution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name, rate and hours");
        Employee employee1 = new Employee(sc.nextLine(), sc.nextInt(), sc.nextInt() );
        sc.nextLine();
        String firstEmployee  = employee1.toString();
        System.out.println(firstEmployee);

        System.out.println("enter name, rate and hours");
        Employee employee2 = new Employee(sc.nextLine(), sc.nextInt(), sc.nextInt() );
        sc.nextLine();
        String secondEmployee  = employee2.toString();
        System.out.println(secondEmployee);
        System.out.println("enter name, rate and hours");
        Employee employee3 = new Employee(sc.nextLine(), sc.nextInt(), sc.nextInt() );
        String thirdEmployee  = employee3.toString();
        System.out.println(thirdEmployee);

    }
}
