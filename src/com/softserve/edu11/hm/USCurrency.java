package com.softserve.edu11.hm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = "[0-9]+\\.([0-9]+)\\$";
        String input = sc.nextLine();
        sc.close();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println(input.substring(m.start(), m.end()));
        }
    }
}
