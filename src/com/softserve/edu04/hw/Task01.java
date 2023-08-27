package com.softserve.edu04.hw;

import static com.softserve.edu04.hw.App.SCANNER;

public class Task01 {
    static private int countNumbersInTheRange;
    private float floatNumber;

    public Task01() {
        this(0);
    }

    public Task01(float floatNumber) {
        this.floatNumber = floatNumber;
    }

    public static float inputFloatNumber() {
        System.out.print("Input your float number: ");
        float floatNumber = SCANNER.nextFloat();
        SCANNER.nextLine();
        if (floatNumber >= -5 && floatNumber <= 5) {
            ++countNumbersInTheRange;
        }
        return floatNumber;
    }

    public static void getCountOddNumbers() {
        System.out.println("The count of float numbers in the range [-5; 5] is " + countNumbersInTheRange + ": ");
    }

    public float getFloatNumber() {
        return floatNumber;
    }

    public void setFloatNumber(float floatNumber) {
        if (floatNumber >= -5 && floatNumber <= 5) {
            this.floatNumber = floatNumber;
        }
    }
}
