import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(LocalDate.now().getDayOfWeek().
                getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk-ua")));
    }
}