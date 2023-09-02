import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        String today = formatter.format(LocalDate.now());
        System.out.println(today);

        var today1 = formatter.parse(today, LocalDate :: from);
        System.out.println(today1);
    }
}