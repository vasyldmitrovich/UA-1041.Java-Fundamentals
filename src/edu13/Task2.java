package edu13;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Task2 {


    public class Main {
        public static void main(String[] args) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            var today = formatter.format(LocalDate.now());
            System.out.println(today);
            System.out.println(formatter.parse(today, LocalDate::from));
        }
    }
}
