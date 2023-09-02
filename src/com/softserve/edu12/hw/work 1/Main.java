import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Input the first number: ");
            double num1 = SCANNER.nextDouble();

            System.out.println("Input the second number: ");
            double num2 = SCANNER.nextDouble();

            System.out.println("Result: " + div(num1, num2));
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid double numbers.");
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
