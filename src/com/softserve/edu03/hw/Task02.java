package com.softserve.edu03.hw;

import static com.softserve.edu03.hw.App.SCANNER;

public class Task02 {
    static private int int1;
    static private int int2;
    static private int int3;
    static private int min;
    static private String message;

    public static int getNumber(String prompt){
        System.out.print(prompt);
        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        return number;
    }

    public static String getMinNumber(int int1, int int2, int int3) {
        if (int2 > int1) {
            min = int1;
        } else {
            min = int2;
        }
        if (min > int3) {
            min = int3;
        }
        message = "The smallest number is " + min;
        return message;
    }
}
