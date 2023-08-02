import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        System.out.println("Input first number: ");
        num1 = SCANNER.nextInt();
        System.out.println("Input second number: ");
        num2 = SCANNER.nextInt();
        System.out.println("Input third number: ");
        num3 = SCANNER.nextInt();

        if (num1 % 2 == 1) {
            System.out.println("First number is odd");
        }
        if (num2 % 2 == 1) {
            System.out.println("Second number is odd");
        }
        if (num3 % 2 == 1) {
            System.out.println("Third number is odd");
        }
    }
}