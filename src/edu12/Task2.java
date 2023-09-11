package edu12;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                int[] array = new int[10];
                int i = 0;
                while (i < 10) {
                    try {
                        System.out.printf("enter %dst number:\n", i + 1);

                        array[i] = readNumber(i == 0 ? 1 : array[i - 1], 100);
                        if (100 - array[i] < (array.length - i - 1)) {
                            throw new OutOfMemoryError("You do not have enough slots in the array to satisfy the condition(1 < a1 < ... < a10 < 100), try again");
                        }
                        i++;
                    } catch (NumberFormatException e) {
                        System.out.println("You must to input integer number, try again");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("your numbers:" + Arrays.toString(array));
                break;
            } catch (OutOfMemoryError e) {
                System.out.println(e.getMessage());
                ;
            }
        }

    }

    private static int readNumber(int start, int end) {
        int number = Integer.parseInt(SCANNER.nextLine());
        if (number <= start || number >= end) {
            throw new IllegalArgumentException("number out of range, try again!");
        }
        return number;
    }
}
