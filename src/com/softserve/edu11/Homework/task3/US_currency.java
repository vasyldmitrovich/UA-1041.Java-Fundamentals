package com.softserve.edu11.Homework.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class US_currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter the sentence:");
        String text = scanner.nextLine();


        String currencyRegex = "\\$\\d+(\\.\\d{2})?"; // Знак долара, цифри, опціонально крапка та дві цифри

        Pattern p = Pattern.compile(currencyRegex);

        Matcher m = p.matcher(text);

        System.out.println("Знайдені валютні формати в тексті:");
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}
