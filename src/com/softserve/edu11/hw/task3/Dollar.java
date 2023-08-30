package com.softserve.edu11.hw.task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dollar {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input a text: ");
        String input = sc.nextLine();
        displayUSFormat(input);
    }

    public static void displayUSFormat(String text){
        Arrays.stream(text.split("\\s")).filter(a -> checkFormat(a)).forEach(System.out::println);
    }

    public static boolean checkFormat(String value){
       return Pattern.compile("^\\$\\d+\\.\\d{2}$").matcher(value).find();
    }
}

//        FOR TESTING

//        String input = """
//        Price for headphones: $104.90
//        and memory $180.78
//        """;

//        OUTPUT: $104.90 $180.78