package com.softserve.edu05.hm;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        doLoop();

    }
    public static void doLoop(){
        Scanner sc = new Scanner(System.in);
        String response;
        //Logic like that write in some method and there call this method
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
