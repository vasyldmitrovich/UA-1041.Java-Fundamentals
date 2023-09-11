package edu13;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Task4 {


    public class Main {
        public static void main(String[] args) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate birthDate = LocalDate.from(formatter.parse("03.04.1990"));
            int month = 0;
            System.out.println("day of week in birth year was: " + dayOfWeekAfterSomeMonths(birthDate, month));
            month = 6;
            System.out.printf("day of week after %d months after birth day was:%s%n", month, dayOfWeekAfterSomeMonths(birthDate, month));
            month = 12;
            System.out.printf("day of week after %d months after birth day was:%s%n", month, dayOfWeekAfterSomeMonths(birthDate, month));
        }


        private static DayOfWeek dayOfWeekAfterSomeMonths(LocalDate birthDate, int month) {

            return birthDate.plusMonths(month).getDayOfWeek();
        }


    }
}
