package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw03 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a text containing several instances of US currency format: ");
        String text = SC.nextLine();

        matchUSCurrencyFormat(text);
    }

    public static void matchUSCurrencyFormat(String string) {
        String pattern = "\\$\\d*(\\.\\d{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(string);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

