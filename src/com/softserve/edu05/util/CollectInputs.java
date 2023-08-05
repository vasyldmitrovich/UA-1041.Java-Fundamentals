package com.softserve.edu05.util;

import java.util.Scanner;

public class CollectInputs {
    private static final Scanner sc = new Scanner(System.in);

    public static float inputNumberFloat(String message) {
        System.out.format("%s :\n", message);
        return sc.nextFloat();
    }

    public static float inputNumberFloat() {
        return sc.nextFloat();
    }

    public static int inputNumberInt(String message) {
        System.out.format("%s :\n", message);
        return sc.nextInt();
    }

    public static int inputNumberInt() {
        return sc.nextInt();
    }

    public static String inputString(String message) {
        System.out.format("%s :\n", message);
        String str = sc.next();
        return str;
    }

}
