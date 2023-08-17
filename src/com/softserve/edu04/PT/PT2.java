package com.softserve.edu04.PT;

import java.util.Scanner;

public class PT2 {//Ok
    public static void main(String[] args) {
        System.out.println("Enter the number of hte day of week");
        Scanner sc = new Scanner(System.in);
        String numberOfTheDay = sc.nextLine();

        var response = switch (numberOfTheDay) {
            case "1" -> "Понелілок, Monday";
            case "2" -> "Вівторок, Tuesday";
            case "3" -> "Середа, Wednesday";
            case "4" -> "Четвер, Thursday";
            case "5" -> "П'ятниця, Friday";
            case "6" -> "Субота, Saturday";
            case "7" -> "Неділя, Sunday";
            default -> throw new IllegalStateException("Unexpected value");
        };
        System.out.println(response);
    }
}
