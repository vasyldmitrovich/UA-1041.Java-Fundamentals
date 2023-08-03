import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input first number: ");
        int num1 = SCANNER.nextInt();
        System.out.println("Input second number: ");
        int num2 = SCANNER.nextInt();
        System.out.println("Input third number: ");
        int num3 = SCANNER.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}