import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter a number (" + start + " < a" + (i + 1) + " < " + end + "): ");
                numbers[i] = readNumber(SCANNER, start, end);
                start = numbers[i] + 1;
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Entered numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println("a" + (i + 1) + ": " + numbers[i]);
        }
    }

    public static int readNumber(Scanner scanner, int start, int end) {
        int number;
        while (true) {
            try {
                number = scanner.nextInt();
                if (number > start && number < end) {
                    return number;
                } else {
                    throw new IllegalArgumentException("Number must be in the range (" + start + " < number < " + end + ")");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.err.println("Invalid input. Please enter a valid integer.");
                System.out.println("Enter a number (1 < a < 100): ");
            }
        }
    }
}
