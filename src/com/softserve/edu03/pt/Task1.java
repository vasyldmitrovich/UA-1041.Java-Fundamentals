package com.softserve.edu03.pt;

import static com.softserve.edu03.pt.App.SCANNER;

public class Task1 {
    static private int int1;
    static private int int2;
    static private int int3;
    static private int sum;
    static private double av;
    static private String message;


    public static String getTotal(int int1, int int2) {
        sum= int1+int2;
        message = "The sum of " + int1 + " and " + int2 + " is " + sum;
        return message;
    }

    public static String getAverage(int int1, int int2) {
        av = sum/2.0;
        message = "The average of " + int1 + " and " + int2 +
                " is " + av;
        return message;
    }

    public static int getNumber(String prompt){
        System.out.print(prompt);
        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        return number;
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public int getInt2() {
        return int2;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }
}