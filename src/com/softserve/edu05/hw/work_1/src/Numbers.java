import java.util.Arrays;
import java.util.Scanner;
public class Numbers {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = new int[5];

        System.out.println("Enter 5 integers numbers: ");
        for (int i = 0; i < 5; i++) {
            nums[i] = SCANNER.nextInt();
        }

        // point 1
        int countPositive = 0;
        int position = -1; // прапорець -1, якщо число не знайдеться

        for (int i = 0; i < 5; i++) {
            if (nums[i] > 0) {
                countPositive++;
                if (countPositive == 2) {
                    position = i + 1;
                    break;
                }
            }
        }
        if (position != -1) {
            System.out.println("Position of the second positive number: " + position);
        } else {
            System.out.println("No second positive number found.");
        }

        // point 2
        int min = nums[0];
        int Position = 0;

        for (int i = 1; i < 5; i++) {
            if (nums[i] < min) {
                min = nums[i];
                Position = i;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Position of the minimum value: " + (Position + 1));

        // point 3
        int product = 1;
        for (int number : nums) {
            if (number != 0 && number % 2 == 0) {
                product *= number;
            }
        }
            System.out.println("Product of even numbers: " + product);

    }
}