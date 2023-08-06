package com.softserve.edu01.src;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        //Ok
        System.out.println("input flower bed radius: ");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        System.out.println("Perimeter of your flower bed is: " + radius * 3.14 * 2);
        System.out.println("Area of your flower bed is: " + radius * radius * 3.14);
    }
}