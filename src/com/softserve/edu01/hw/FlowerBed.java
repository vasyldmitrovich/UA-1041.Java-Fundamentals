package com.softserve.edu01.hw;

import java.util.Locale;
import java.util.Scanner;

public class FlowerBed {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("eng"));
        final double PI = 3.1415;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius:");
        double radius = sc.nextDouble();
        //Perimeter =2PIr
        double perimeter = 2*PI*radius;
        //Area =PIr^2
        double area =PI*Math.pow(radius,2);

        System.out.format("Perimeter: %.2f units\nArea: %.2f units^2",perimeter,area);
    }
}
