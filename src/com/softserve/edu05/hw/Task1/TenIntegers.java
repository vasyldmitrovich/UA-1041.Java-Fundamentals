package com.softserve.edu05.hw.Task1;

import static com.softserve.edu05.util.CollectInputs.fulfillIntArray;

public class TenIntegers {
    private final int[] tenIntArr = new int[10];

    public void fullfillTenIntArray() {
        fulfillIntArray(this.tenIntArr);
    }

    private boolean isFirstFivePositive() {
        for (int i = 0; i < 5; i++) {
            if (tenIntArr[i] < 0) return false;
        }
        return true;
    }

    private boolean isLastFiveNegative() {
        for (int i = 5; i > 0; i--) {
            if (tenIntArr[tenIntArr.length - i] > 0) return false;
        }
        return true;
    }

    public void outputResults() {
        int sumOfPositive = 0;
        int prodOfNegative = 1;

        if (isFirstFivePositive()) {
            for (int i = 0; i < 5; i++) {
                sumOfPositive += tenIntArr[i];
            }
            System.out.println("The sum of first five elements is:" + sumOfPositive);
        }

        if (isLastFiveNegative()) {
            for (int i = 5; i > 0; i--) {
                prodOfNegative *= tenIntArr[tenIntArr.length - i];
            }
            System.out.println("The production of last five elements is:" + prodOfNegative);
        }

        if (!isLastFiveNegative() && !isFirstFivePositive()) {
            System.out.println("This array doesn't meet the conditions");
        }
    }
}
