package com.softserve.edu04.practicaltask;


import static com.softserve.edu04.practicaltask.Main.SCANNER;

public class OddOrEven {
    private double firstNum;
    private double secondNum;
    private double thirdNum;
    private int count;

    public OddOrEven() {
    }

    public OddOrEven(double firstNum, double secondNum, double thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    public static void promptOddOrEven(OddOrEven numOdd) {
        System.out.print("Input the first number: ");
        int num1 = SCANNER.nextInt();
        numOdd.setFirstNum(num1);
        System.out.print("Input the second number: ");
        int num2 = SCANNER.nextInt();
        numOdd.setSecondNum(num2);
        System.out.print("Input the third number: ");
        int num3 = SCANNER.nextInt();
        numOdd.setThirdNum(num3);
    }

    public int getCount() {
        return count;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getThirdNum() {
        return thirdNum;
    }

    public void setThirdNum(double thirdNum) {
        this.thirdNum = thirdNum;
    }

    public void isOdd(OddOrEven num) {
        if (firstNum % 2 != 0) {
            System.out.printf("\nFirst number %s is odd", firstNum);
            count++;
        }
        if (secondNum % 2 != 0) {
            System.out.printf("\nSecond number %s is odd", secondNum);
            count++;
        }
        if (thirdNum % 2 != 0) {
            System.out.printf("\nThird number %s is odd", thirdNum);
            count++;
        }
    }


    public void promptNumOfOdd(OddOrEven num) {
        System.out.format("\nQuantity of odd numbers is: %s", getCount());
        System.out.println(" ");
    }
}
