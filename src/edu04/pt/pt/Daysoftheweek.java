package edu04.pt.pt;

import java.util.Scanner;

public class Daysoftheweek {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number day of week: ");
            int day = scanner.nextInt();

            switch (day) {
                case 1 -> System.out.println("Monday\n"+"Montag");
                case 2 -> System.out.println("Tuesday\n" + "Вівторок");
                case 3 -> System.out.println("Wednesday\n" + "Середа");
                case 4 -> System.out.println("Thursday\n" + "Четвер");
                case 5 -> System.out.println("Friday\n" + "П'ятниця");
                case 6 -> System.out.println("Saturday\n" + "Субота");
                case 7 -> System.out.println("Sunday\n" + "Неділя");
                default -> System.out.println("Enter correct day number");
            }
        }
    }

