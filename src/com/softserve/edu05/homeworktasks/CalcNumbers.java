package com.softserve.edu05.homeworktasks;

import java.util.Arrays;

import static com.softserve.edu05.homeworktasks.Main.SCANNER;

public class CalcNumbers {//Good
    private int[] numbers;

    public CalcNumbers() {
    }

    public CalcNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void userInput(CalcNumbers obj) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Number %s: ", i + 1);
            array[i] = SCANNER.nextInt();
        }
        setNumbers(array);
    }

    public void calcTheNumbers(CalcNumbers obj) {
        Arrays.sort(numbers);
        int[] num = numbers;
        int[] reverseNum = new int[10];
        int j = 0;
        for(int i = num.length - 1; i >= 0; i--){
            reverseNum[j] = num[i];
            j++;
        }
        int sumPos = 0;
        int sumNeg =0;

        for(int i = 0; i <= reverseNum.length / 2; i++) {
            if(reverseNum[i] >= 0){
                sumPos += reverseNum[i];
            }
        }

        for(int k = 5; k <= reverseNum.length - 1; k++){
            if(reverseNum[k] < 0){
                sumNeg += reverseNum[k];
            }
        }
        System.out.println("Sum of positive numbers is: " + sumPos);
        System.out.println("Sum of negative numbers is: " + sumNeg);

    }

    public void promptCalcNumber(CalcNumbers obj) {
        System.out.println("--------------------------------");
        System.out.println("Task #2");
        System.out.println("Please input the numbers");
        userInput(obj);
        calcTheNumbers(obj);
        System.out.println("--------------------------------");
    }
}
