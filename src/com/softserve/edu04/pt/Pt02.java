package com.softserve.edu04.pt;

import java.util.Scanner;

public class Pt02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number day of week: ");
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println("Monday\nПонеділок");
        }
        if (day == 2) {
            System.out.println("Tuesday\n" + "Вівторок");
        }
        if (day == 3) {
            System.out.println("Wednesday\n" + "Середа");
        }
        if (day == 4) {
            System.out.println("Thursday\n" + "Четвер");
        }
        if (day == 5) {
            System.out.println("Friday\n" + "П'ятниця");
        }
        if (day == 6) {
            System.out.println("Saturday\n" + "Субота");
        }
        if (day == 7) {
            System.out.println("Sunday\n" + "Неділя");
        }
    }
}