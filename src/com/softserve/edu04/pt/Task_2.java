package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int numberOfDay = scanner.nextInt();
        if (numberOfDay == 1) {
            System.out.println("Sunday");
            System.out.println("Воскресенье");
        } else if(numberOfDay == 2) {
            System.out.println("Monday");
            System.out.println("Понедельник");
        } else if(numberOfDay == 3) {
            System.out.println("Thuesday");
            System.out.println("Вторинк");
        }else if(numberOfDay == 4) {
            System.out.println("Wednesday");
            System.out.println("Среда");
        }else if(numberOfDay == 5) {
            System.out.println("Thersday");
            System.out.println("Четверг");
        }else if(numberOfDay == 6) {
            System.out.println("Friday");
            System.out.println("Пятница");
        }else if(numberOfDay == 7) {
            System.out.println("Sutarday");
            System.out.println("Суббота");
        } else {
            System.out.println("It is not a day of the week");
        }
    }
}

