package com.softserve.edu03.hw;

import static com.softserve.edu03.hw.App.SCANNER;

public class Task01 {
    static private int int1;
    static private int int2;
    static private int int3;
    static private double p;
    static private double area;
    static private double formula;
    static private String message;

    public static int getNumber(String prompt){
        System.out.print(prompt);
        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        return number;
    }

    public static String getArea(int int1, int int2, int int3) {
        p = (int1+int2+int3)/2.0;
        formula = p*(p-int1)*(p-int2)*(p-int3);
        area = Math.sqrt(formula);
        message = "The area of the triangle is %.2f".formatted(area);
        return message;
    }
}
