package com.softserve.edu04.pt.pt2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int numberOfDay = scanner.nextInt();
        if (numberOfDay == 1) {
            System.out.println("Sunday, Неділя");
        } else if(numberOfDay == 2) {
            System.out.println("Monday, Понеділок");
        } else if(numberOfDay == 3) {
            System.out.println("Tuesday, Вівторок");
        }else if(numberOfDay == 4) {
            System.out.println("Wednesday, Середа");
        }else if(numberOfDay == 5) {
            System.out.println("Thersday, Четвер");
        }else if(numberOfDay == 6) {
            System.out.println("Friday, П'ятниця");
        }else if(numberOfDay == 7) {
            System.out.println("Saturday, Субота");
        } else {
            System.out.println("It is not a day of the week");
        }
    }
}

