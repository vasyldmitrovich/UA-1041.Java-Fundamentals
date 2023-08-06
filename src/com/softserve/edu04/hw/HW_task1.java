package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float [] listOfNum = new float[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Give me a number: ");
            float myNum = scanner.nextInt();
            listOfNum[i] = myNum;
        }
        for (float num: listOfNum) {
            if((num < (-5.0)) || (num > 5.0)) {
                System.out.println("This number is not in a range: " + num);
            }
        }
    }
}
