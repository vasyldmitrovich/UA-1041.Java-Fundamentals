package com.softserve.edu04.Homework.task4;

import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Input number of students for winter: ");
        int num1 = scanner.nextInt();

        System.out.print("Input number of students for spring: ");
        int num2 = scanner.nextInt();

        System.out.print("Input number of students for summer: ");
        int num3 = scanner.nextInt();

        System.out.print("Input number of students for autumn: ");
        int num4 = scanner.nextInt();

       Season season1 = Season.AUTUMN;//Add one space before this lind, should be four staces
       Season season2 = Season.SPRING;
       Season season3 = Season.SUMMER;
       Season season4 = Season.WINTER;
        System.out.println("Number of student in\t" + season1 + " is\t "+ num1);
        System.out.println("Number of student in\t" + season2 +  " is\t " + num2);
        System.out.println("Number of student in\t" + season3 + " is\t " + num3);
        System.out.println("Number of student in\t" + season4 + " is\t " + num4);



    }



}








