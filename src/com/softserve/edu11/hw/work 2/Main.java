import java.util.*;
public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence with words separated by more than one space: ");
        String sentence = SCANNER.nextLine();

        String cleaned = sentence.replaceAll("\\s+", " ");
        System.out.println(cleaned);
    }
}
