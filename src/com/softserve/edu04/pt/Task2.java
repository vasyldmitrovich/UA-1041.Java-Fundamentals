package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Day.values()[inputData() - 1]);
    }

    private static int inputData(){
        int numberOfDay;
        do{
            System.out.print("Input number of day: ");
            numberOfDay = sc.nextInt();
            if(numberOfDay > 0 && numberOfDay < 8)
                break;
            System.err.println("Incorrect data");
            System.out.println("Please, try again!");
        }while (true);

        return numberOfDay;
    }

}

enum Day{
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday","П\'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private String en;
    private String ua;

    Day(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    @Override
    public String toString() {
        return en + "/" + ua;
    }
}