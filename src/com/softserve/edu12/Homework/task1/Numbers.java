package com.softserve.edu12.Homework.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {

                System.out.println("Enter num1:");
                double num1 = SCANNER.nextDouble();
                System.out.println("Enter num2:");
                double num2 = SCANNER.nextDouble();
                double result = div(num1, num2);
                System.out.println("calculates the dividing of two double type numbers is" + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("You should enter an double");
            }catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static double div(double num1, double num2) {
        if (num1  != 0) {

            return num1 / num2;
        }
            throw new IllegalArgumentException("Can't to dividing by 0");
        }
    }





