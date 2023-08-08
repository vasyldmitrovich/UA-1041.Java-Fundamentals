package com.softserve.edu04.HW;

import java.util.Scanner;

public class HW3 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Input a number representing an HTTP error: ");
        String numberErr = SCANNER.nextLine();
        var response = switch (numberErr) {
            case "400" -> "Bad Request";
            case "401" -> "Unauthorized";
            case "403" -> "Forbidden";
            case "404" -> "Not found";
            case "502" -> "Bad Gateway";
            case "503" -> "Service Unavailable";
            case "504" -> "Gateway Timeout";
            default -> throw new IllegalStateException("Unexpected value");
        };
        System.out.println(response);



    }
}
