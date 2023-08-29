package com.softserve.edu05.Homework.task2;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {

        System.out.print("Input number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Input number2: ");
        int number2 = scanner.nextInt();

        int sum = number1+number2;
        System.out.println("Sum is :" + sum);

        System.out.println("Repeat the operation again?(Yes/No)");
        scanner.nextLine();
        answer = scanner.nextLine();


        } while (answer.equals("Yes"));

        System.out.print("bye!");
        scanner.close();


    }


}
