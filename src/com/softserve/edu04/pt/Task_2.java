package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int numberOfDay = scanner.nextInt();
        if (numberOfDay == 1) {
            System.out.println("In English Sunday, in Russian Воскресенье");
        } else if(numberOfDay == 2) {
            System.out.println("In English Monday, in Russian Понедельник");
        } else if(numberOfDay == 3) {
            System.out.println("In English Tuesday, in Russian Вторинк");
        }else if(numberOfDay == 4) {
            System.out.println("In English Wednesday, in Russian Среда");
        }else if(numberOfDay == 5) {
            System.out.println("In English Thersday, in Russian Четверг");
        }else if(numberOfDay == 6) {
            System.out.println("In English Friday, in Russian Пятница");
        }else if(numberOfDay == 7) {
            System.out.println("In English Saturday, in Russian Суббота");
        } else {
            System.out.println("It is not a day of the week");
        }
    }
}

