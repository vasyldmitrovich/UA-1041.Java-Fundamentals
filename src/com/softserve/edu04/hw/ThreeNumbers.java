package com.softserve.edu04.hw;

public class ThreeNumbers {
    static float min = -5;
    static float max = 5;

    protected static boolean checkIfInRange(float num, float min, float max) {
        return num >= min && num <= max;
    }

    public static void checkIfAllNumsInRange(float firstNum, float secondNum, float thirdNum) {
        if (checkIfInRange(firstNum, min, max) && checkIfInRange(secondNum, min, max) && checkIfInRange(thirdNum, min, max)) {
            System.out.println("All numbers are in range");
        } else {
            System.out.println("Some numbers out of range");
        }
    }
}
