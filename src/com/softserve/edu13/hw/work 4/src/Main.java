import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 8, 4);
        info(birthday);
    }
    public static void info(LocalDate birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        System.out.println("Your birthday at " + dayOfWeek);

        LocalDate sixMonthsLater = birthday.plusMonths(6);
        DayOfWeek afterSixMonth = sixMonthsLater.getDayOfWeek();
        System.out.println("After 6 months, it will be a " + afterSixMonth + " on " + formatter.format(sixMonthsLater));

        LocalDate yearLater = birthday.plusMonths(12);
        DayOfWeek afterYear = yearLater.getDayOfWeek();
        System.out.println("After 12 months, it will be a " + afterYear + " on " + formatter.format(yearLater));
    }
}