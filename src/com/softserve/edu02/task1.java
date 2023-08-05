package com.softserve.edu02;
//In your local project mark as source code package src
import java.util.Scanner;

//Class should start from upper case, for example Task1.java
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);
    }
}
