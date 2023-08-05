package com.softserve.edu05.hw.Task1;

import static com.softserve.edu05.util.CollectInputs.fulfillIntArray;

public class FiveIntegers {
    private final int[] fiveIntArr = new int[5];

    public void fullfillFiveIntArray() {
        fulfillIntArray(fiveIntArr);
    }

    public int smallestValueIndex() {
        int smallestIndx = 0;
        for (int i = 0; i < fiveIntArr.length; i++) {
            smallestIndx = fiveIntArr[i] < fiveIntArr[smallestIndx] ? i : smallestIndx;
        }
        return smallestIndx;
    }

    public int[] getFiveIntArr() {
        return fiveIntArr;
    }

    public int positionOfSecondPositive() {
        int count = 0;
        int position = 0;
        while (count != 2) {
            if (fiveIntArr[position] > 0) {
                count++;
            }
            position++;
        }
        return position - 1;
    }

    public int productionOfEvens() {
        int production = 1;
        for (int num : fiveIntArr
        ) {
            if (num % 2 == 0 && num != 0) {
                production *= num;
            }
        }
        return production;
    }

}
