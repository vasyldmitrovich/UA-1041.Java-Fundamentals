package com.softserve.edu05.hm;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        do {
            System.out.println("Enter two numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            sc.nextLine();
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
            System.out.println("Want to try again?");
            response = sc.nextLine();
        } while (response.equals("yes"));
    }
}
