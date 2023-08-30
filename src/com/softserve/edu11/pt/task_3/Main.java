package com.softserve.edu11.pt.task_3;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = getName("Enter %dst name:".formatted(i + 1));
        }
        for (var name : names
        ) {
            System.out.printf("name '%s' is %s%n",
                    name, validate(name) ? "validate" : "invalidate"
            );
        }
    }

    private static String getName(String text) {
        System.out.println(text);
        return SCANNER.nextLine();
    }

    public static boolean validate(String name) {
        return name.matches("\\w{3,15}");
    }
}
