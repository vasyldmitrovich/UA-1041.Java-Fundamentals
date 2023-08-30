package com.softserve.edu11.hw.task_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String text = "I exchanged $50.52, $70.1 and €10.70 for 240 UAH";
        System.out.println("some text:\n" + text);

        findCurrencyFormatUS(text);
    }

    private static void findCurrencyFormatUS(String text) {

        Pattern p = Pattern.compile("\\$\\d+(\\.)?(\\d+)?");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }
    }


    private static void currencyFormats(String inputText) {
        String currencyPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("US currency formats found:");

        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }

}