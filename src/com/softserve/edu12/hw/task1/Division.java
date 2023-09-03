package com.softserve.edu12.hw.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Enter first number: ");
            double fNum = sc.nextDouble();
            System.out.print("Enter second number: ");
            double sNum = sc.nextDouble();
            System.out.println("Result: " + division(fNum, sNum));
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException ex){
            System.err.println("You should input double numbers");
        }




    }

    public static double division(double fNum, double sNum){
        if(sNum != 0){
            return  fNum / sNum;
        }
            throw new ArithmeticException("You can\'t divide by zero");
    }
}
