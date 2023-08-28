package com.softserve.edu12.hw.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        while (true) {
            try {
                var scaner=new Scanner(System.in);
                System.out.println("Enter first number");
                int firstNumber=scaner.nextInt();
                System.out.println("Enter second number");
                int secondNumber=scaner.nextInt();
                double result=div(firstNumber,secondNumber);
                System.out.println(result);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }catch (InputMismatchException e){
                System.out.println("Enter an integer or Double");
                System.out.println();
            }
        }

    }
    public static double div(double firstNumber, double secondNumber) {
        if(secondNumber==0){
            throw new IllegalArgumentException("Incorrect number");
        }
        return firstNumber/secondNumber;
    }
}