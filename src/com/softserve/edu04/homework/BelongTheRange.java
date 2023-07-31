package com.softserve.edu04.homework;

import static com.softserve.edu04.homework.Main.SCANNER;

public class BelongTheRange {
    private float firstNum;
    private float secondNum;
    private float thirdNum;

    public BelongTheRange() {
    }

    public BelongTheRange(float firstNum, float secondNum, float thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    public float getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(float firstNum) {
        this.firstNum = firstNum;
    }

    public float getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(float secondNum) {
        this.secondNum = secondNum;
    }

    public float getThirdNum() {
        return thirdNum;
    }

    public void setThirdNum(float thirdNum) {
        this.thirdNum = thirdNum;
    }

    public void isBelongTheRange(BelongTheRange obj) {
        int minRange = -5;
        int maxRange = 5;

        System.out.println("\n\tRESULT OF COMPARING");

        if (firstNum >= minRange && firstNum <= maxRange) {
            System.out.printf("First number (%s) belong to the range", firstNum);
        } else {
            System.out.printf("ERROR: First number (%s) out of the range", firstNum);
        }

        if (secondNum >= minRange && secondNum <= maxRange) {
            System.out.printf("\nSecond number (%s) belong to the range", secondNum);
        } else {
            System.out.printf("\nERROR: Second number (%s) out of the range", secondNum);
        }

        if (thirdNum >= minRange && thirdNum <= maxRange) {
            System.out.printf("\nThird number (%s) belong to the range", thirdNum);
        } else {
            System.out.printf("\nERROR: Third number (%s) out of the range", thirdNum);
        }
    }

    public void promptBelongTheRange(BelongTheRange obj) {
        System.out.print("\n\t*****FIRST TASK*****");
        System.out.println("\nProvide three numbers to check is they belong to the range [-5; 5]");
        System.out.print("\nInput first number: ");
        float num1 = SCANNER.nextFloat();
        setFirstNum(num1);
        System.out.print("Input second number: ");
        float num2 = SCANNER.nextFloat();
        setSecondNum(num2);
        System.out.print("Input third number: ");
        float num3 = SCANNER.nextFloat();
        setThirdNum(num3);
    }
}
