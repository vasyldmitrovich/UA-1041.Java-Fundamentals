package edu13.hw;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class task1 {
    public static void main(String[] args) {
        String encrypted = encrypt("abc", 3);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, 3);
        System.out.println("Decrypted: " + decrypted);

        String dateStr = "12.31.22";
        boolean validDate = isValidDate(dateStr);
        System.out.println("Is the date valid? " + validDate);

        int yearToCheck = 2024;
        boolean isLeapYear = isLeapYear(yearToCheck);
        System.out.println(yearToCheck + " is a leap year? " + isLeapYear);

        LocalDate birthday = LocalDate.of(2000, 9, 12);
        printDayOfWeekInfo(birthday);
    }

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + n) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

    public static boolean isValidDate(String dateStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate date = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void printDayOfWeekInfo(LocalDate date) {
        System.out.println("Day of the week on " + date + ": " + date.getDayOfWeek());

        LocalDate sixMonthsLater = date.plusMonths(6);
        System.out.println("Day of the week after 6 months: " + sixMonthsLater.getDayOfWeek());

        LocalDate twelveMonthsLater = date.plusMonths(12);
        System.out.println("Day of the week after 12 months: " + twelveMonthsLater.getDayOfWeek());
    }
}

