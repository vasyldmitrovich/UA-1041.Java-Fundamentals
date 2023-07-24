package com.softserve.edu02.hm;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Double radius;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        double perimetr = radius * Math.PI * 2;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Your perimetr:" + perimetr);
        System.out.println("Your area:" + area);
        }
}