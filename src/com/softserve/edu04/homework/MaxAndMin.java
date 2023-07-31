package com.softserve.edu04.homework;

import static com.softserve.edu04.homework.Main.SCANNER;

public class MaxAndMin {
    private int firstNum;
    private int secondNum;
    private int thirdNum;

    public MaxAndMin() {
    }

    public MaxAndMin(int firstNum, int secondNum, int thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int getThirdNum() {
        return thirdNum;
    }

    public void setThirdNum(int thirdNum) {
        this.thirdNum = thirdNum;
    }

    public int getMax(MaxAndMin maxAndMin) {
        return Math.max(firstNum, Math.max(secondNum, thirdNum));
    }

    public int getMin(MaxAndMin maxAndMin) {
        return Math.min(firstNum, Math.min(secondNum, thirdNum));

    }

    public void promptMaxAndMin(MaxAndMin maxAndMin) {
        System.out.print("\n\t*****SECOND TASK*****");
        System.out.println("\nProvide the three integer numbers to check maximum and minimum of them");
        System.out.print("\nInput first number: ");
        int num1 = SCANNER.nextInt();
        setFirstNum(num1);
        System.out.print("Input second number: ");
        int num2 = SCANNER.nextInt();
        setSecondNum(num2);
        System.out.print("Input third number: ");
        int num3 = SCANNER.nextInt();
        setThirdNum(num3);
    }

    public void resultMaxAndMin(MaxAndMin maxAndMin){
        System.out.print("\nRESULT OF COMPARING");
        System.out.println("\n\tThe maximum is: " + getMax(maxAndMin));
        System.out.println("\tThe minimum is: " + getMin(maxAndMin));
    }
}
