package com.softserve.edu04.hw.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String number = getNumber("Input a number representing an HTTP error (use one of the following numbers: 403,404,409,423) : ");
        getError(number);
    }

    private static void getError(String number) {
        HTTPError error;
        error = switch (number) {
            case "403" -> HTTPError.FORBIDDEN;
            case "404" -> HTTPError.NOT_FOUND;
            case "409" -> HTTPError.CONFLICT;
            case "423" -> HTTPError.LOCKED;
            default -> null;
        };
        if (error == null) {
            System.out.println("Use the numbers that are listed above!");
        } else {
            System.out.println(error);
        }
    }//Good

    public static String getNumber(String num) {
        Scanner sc = new Scanner(System.in);
        System.out.print(num);
        return sc.nextLine();
    }

}

