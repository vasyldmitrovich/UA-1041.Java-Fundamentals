package com.softserve.edu13.homeworktasks;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        //Task #1
        encrypt("Hello my friend", 3);
        decrypt("Jrrge|h#p|#iulhqg", 3);

        //Task #2
        formatDate();
        System.out.println(isValidDate("10.08.23"));
        System.out.println(isValidDate("13.08.23"));
        System.out.println(isValidDate("12.32.23"));

        //Task #3
        isLeapYear();

        //Task #4
        printDayOfMyBirthday();
    }

    private static void printDayOfMyBirthday() {
        System.out.print("Write your date of birth (dd/mm/yyyy):");
        int dateOfBirth = SCANNER.nextInt();
        int monthOfBirth = SCANNER.nextInt();
        int yearOfBirth = SCANNER.nextInt();
        LocalDate birthday = LocalDate.of(yearOfBirth, monthOfBirth, dateOfBirth);
        Period month = Period.ofMonths(6);
        Period year = Period.ofYears(1);
        LocalDate birthdayPlusMonth = birthday.plus(month);
        LocalDate birthdayPlusYear = birthday.plus(year);
        System.out.println("Day of the week: " + birthday.getDayOfWeek());
        System.out.println("Day of the week after 6 month: " + birthdayPlusMonth.getDayOfWeek());
        System.out.println("Day of the week after 12 month: " + birthdayPlusYear.getDayOfWeek());
    }

    private static void isLeapYear() {
        System.out.print("Please input the year which you want to check: ");

        int year = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.format("Your year %d is %s leap\n", year, Year.isLeap(year) ? "" : "not");
    }


    private static boolean isValidDate(String date) {
        try {
            DateTimeFormatter.ofPattern("MM.dd.yy").parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void encrypt(String str, int moveLetterForward) {
        int[] chars = str.chars().toArray();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] + moveLetterForward;
            encrypted.append(Character.toChars(chars[i]));
        }
        System.out.println(encrypted);
    }

    public static void decrypt(String str, int moveLetterToward) {
        int[] chars = str.chars().toArray();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] - moveLetterToward;
            encrypted.append(Character.toChars(chars[i]));
        }
        System.out.println(encrypted);
    }

    public static void formatDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        String today = formatter.format(LocalDate.now());
        System.out.println(today);
        var today1 = formatter.parse(today, LocalDate::from);
        System.out.println(today1);

    }
}
