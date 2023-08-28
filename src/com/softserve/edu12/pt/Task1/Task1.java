package com.softserve.edu12.pt.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while (true) {
            try {
                var scaner=new Scanner(System.in);
                System.out.println("Enter side a ");
                int a=scaner.nextInt();
                System.out.println("Enter side b ");
                int b=scaner.nextInt();
                int area=getArea(a,b);
                System.out.println(area);
                break;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("Enter an integer");
            }
        }
    }
    public static int getArea(int a, int b) {
    if(a<0 || b<0){
        throw new IllegalArgumentException("Введть числа більші ніж 0");
    }

        return a*b;
    }
}