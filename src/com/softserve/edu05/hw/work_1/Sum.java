import java.util.Scanner;
public class Sum {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = SCANNER.nextInt();
        }

        int sum = 0;
        int product = 1;

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                if (numbers[i] > 0) {
                    sum += numbers[i];
                }
            } else {
                product *= numbers[i];
            }
        }

        if (sum > 0) {
            System.out.println("Sum of the first five elements = " + sum);
        } else {
            System.out.println("Product of the last five elements = " + product);
        }
    }
}