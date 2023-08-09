package com.softserve.edu05.hw.hw01;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        Integer[] dayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNum = sc.nextInt();
        if (monthNum < 1 || monthNum > 12) {
            System.out.println("Wrong month number");
        } else {
            System.out.println("In this month " + dayOfMonth[monthNum] + " days");;
        }
    }
}

