package edu13;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Task3 {


    public class Main {
        public static final Scanner SCANNER = new Scanner(System.in);

        public static void main(String[] args) {
            var currentYear = LocalDate.now().getYear();
            System.out.printf("Current year %d is %sa leap.\n", currentYear, isLeapYear(currentYear) ? "" : "not ");
            System.out.println("enter some year:");
            int year = Integer.parseInt(SCANNER.nextLine());
            System.out.printf("inputting year %d is %sa leap", year, isLeapYear(year) ? "" : "not ");

        }

//    private static boolean isLeapYear(int year) {
//        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
//            return true;
//        }
//        return false;
//    }

        private static boolean isLeapYear(int year) {

            return LocalDate.ofYearDay(year, 1).isLeapYear();
        }
    }
}
