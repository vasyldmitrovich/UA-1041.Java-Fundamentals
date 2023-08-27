package com.softserve.edu04.hw;

import static com.softserve.edu04.hw.App.SCANNER;

public class Task02 {
    private int number;

    public static int getNumber() {
        System.out.print("Input the number: ");
        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        return number;
    }
}
