import java.util.Scanner;

public class Month {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a month number (1-12): ");
        int index = SCANNER.nextInt();

        int[] daysInMonth = {0, 31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int Days = daysInMonth [index];
        System.out.println(Days + " days in the " + index + " month");
    }
}