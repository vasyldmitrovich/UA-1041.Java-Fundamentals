import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    static int num1 = 0, num2 = 0, num3 = 0;
    static int getSmall(int num1, int num2, int num3) {
        int min;

        if (num1 < num2) {
            min = num1;
        } else {
                min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println("Input the first number: ");
        num1 = SCANNER.nextInt();
        System.out.println("Input the second number: ");
        num2 = SCANNER.nextInt();
        System.out.println("Input the third number: ");
        num3 = SCANNER.nextInt();

        System.out.println("The smallest number is " + getSmall(num1, num2, num3));
    }
}