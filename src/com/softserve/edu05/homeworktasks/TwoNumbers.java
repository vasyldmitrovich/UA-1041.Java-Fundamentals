package com.softserve.edu05.homeworktasks;

import static com.softserve.edu05.homeworktasks.Main.SCANNER;

public class TwoNumbers {
    private int[] numbers;

    public TwoNumbers() {
    }

    public TwoNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void userInput(TwoNumbers obj) {
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Number %s: ", i + 1);
            array[i] = SCANNER.nextInt();
        }
        setNumbers(array);
    }

    public void getSum(TwoNumbers obj) {
        int sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum += numbers[i];
        }
        System.out.printf("Sum of numbers is: %s", sum);
    }

    public void promptTwoNumbers(TwoNumbers obj) {
        System.out.println("--------------------------------");
        System.out.println("Task #4");
        String answer;
        do {
            System.out.println("Please input the numbers");
            userInput(obj);
            getSum(obj);
            System.out.println("\nDo you want to try it again? (y/n)");
            answer = SCANNER.nextLine();
            switch (answer) {
                case "y" -> System.out.println("Here we go!");
                case "n" -> System.out.println("Goodbye :(");
                default -> throw new IllegalArgumentException("Incorrect answer!");
            }
        } while (answer.equals("y"));
        System.out.println("--------------------------------");
    }
}
