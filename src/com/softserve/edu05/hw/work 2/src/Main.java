import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;

        do {
            System.out.println("Enter first number: ");
            int num1 = SCANNER.nextInt();
            System.out.println("Enter second number: ");
            int num2 = SCANNER.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum = " + sum);

            System.out.println("Do you want to perform the operation again? (y/n)");
            choice = SCANNER.next().charAt(0);

        } while (choice == 'y');

    }
}