package com.softserve.edu05.Homework.task4;


import java.util.Random;
import java.util.Scanner;

public class Guessnumber {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = -10;
        int max = 10;
        int d = max-min;

        Random random = new Random();
        int res = random.nextInt(d+1);
        System.out.println("Random number :" + res);

        System.out.println("Enter the number:");
        int number ;


        do {

            number = Integer.parseInt(scanner.nextLine());

            if (number > res) {
                System.out.println("Too high, try again");

            } else if (number < res) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Great!");
            }

        } while ( number != res) ;

        }


}

