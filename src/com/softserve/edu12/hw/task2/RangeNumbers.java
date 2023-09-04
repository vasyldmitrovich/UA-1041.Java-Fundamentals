package com.softserve.edu12.hw.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeNumbers {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
        System.out.print("Set start of range: ");
        int start = sc.nextInt();
        System.out.print("Set end of range: ");
        int end = sc.nextInt();
        if(start >= end) throw new RuntimeException("The end of range can\'t be less than start");

            for (int i = 0; i < 10; i++){
                int value = readNumbers(4, 78);
                System.out.println(value);
            }

        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
    }

    public static int readNumbers(int start, int end){
        try {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            if(start < number && number < end){
                return number;
            }else throw new IllegalArgumentException("This number is out of range");
        }catch (InputMismatchException e){
            throw new InputMismatchException("You should input Integer number");
        }
    }
}