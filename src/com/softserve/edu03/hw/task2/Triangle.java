package com.softserve.edu03.hw.task2;

import java.util.Scanner;

public class Triangle {

    static Scanner sc = new Scanner(System.in);

    public static double getNumber(String number){
        System.out.print(number);
        return sc.nextDouble();
    }
    public static double getArea(double a, double b, double c){
        return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
    }

    public static void main(String[] args) {
        double firstSide = getNumber("Input side 1: ");
        double secondSide = getNumber("Input side 2: ");
        double thirdSide = getNumber("Input side 3: ");
        double area = getArea(firstSide,secondSide,thirdSide);
        System.out.format("The area of the triangle is %.2f", area);
    }
}



