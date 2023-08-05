package com.softserve.edu05.hw;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        do {
            System.out.println("enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println(num1 + num2);
            System.out.println("you want to continue? enter yes or no ");
            scanner.nextLine();
            String answer = scanner.nextLine();

            if (answer.equals("yes")) {
                flag = true;
            } else {
                System.out.println("have a nice day)");
                flag = false;
            }
        }
        while (flag==true);
    }
}
