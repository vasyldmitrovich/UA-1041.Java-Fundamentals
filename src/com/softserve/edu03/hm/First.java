package com.softserve.edu03.hm;

import java.util.Scanner;

public class First{
    public static double getArea(double num1, double num2, double num3){

        double s = (num1 + num2 + num3)/2;
        return Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));
        //instead of writing the result to a variable and then returning it, write like this
        // return Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Side 1:");
        double side1 = sc.nextInt();
        System.out.println("Input Side 2:");
        double side2 = sc.nextInt();
        System.out.println("Input Side 3:");
        double side3 = sc.nextInt();
        System.out.printf("The area of the triangle is " + getArea(side1, side2, side3));
    }

}
