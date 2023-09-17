package com.softserve.edu12.Homework.task2;

import java.util.Scanner;

public class Task2 {
    static final Scanner SCANNER = new Scanner(System.in);

    public static int readNumber(int start, int end) {
        int number;

        while (true) {
            try {
                System.out.println("Enter the number in the range: ["+ start +"-" + end + "]");
                number = Integer.parseInt(SCANNER.nextLine());
                if (number < start || number > end) {
                    throw new IllegalArgumentException("Число не знаходиться в діапазоні [" + start + "..." + end + "]");
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Помилка: Некоректне число. Спробуйте ще раз.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = readNumber(start, end);

            if (i > 0 && numbers[i] <= numbers[i - 1]) {
                System.out.println("Число повинно бути більше за попереднє введене число.");
                i--;
            }
        }

        System.out.println("Введені числа:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}






