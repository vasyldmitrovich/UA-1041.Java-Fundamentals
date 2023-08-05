package edu5;
import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MaxNumber = 10;
        int[] arr1 = new int[MaxNumber];
        int sum = 0;
        int count = 0;
        System.out.println("Input 10 numbers:");

        for (int i = 0; i < MaxNumber; i++) {
            arr1[i] = scanner.nextInt();
        }
        scanner.close();

        for (int num : arr1) {
            if (num > 0) {
                sum += num;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum of first 5 positive numbers: " + sum);
    }
}
