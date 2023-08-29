import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter text containing US currency formats: ");
        String text = SCANNER.nextLine();

        String regexPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(text);

        System.out.println("US formats: ");
        while (matcher.find()) {
            String currencyMatch = matcher.group();
            System.out.println(currencyMatch);
        }
    }
}
