package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.App.SCANNER;


public class Task_01 {
    static private int countOddNumbers;
    private int number;

    public Task_01() {
        this(0);
    }

    public Task_01(int number) {
        this.number = number;
    }

    public static int getNumber(String prompt) {
        System.out.print("Input your number: ");
        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        if (number % 2 != 0) {
            ++countOddNumbers;
        }
        return number;
    }

    public static void getCountOddNumbers() {
        System.out.println("Total count of odd numbers is " + countOddNumbers);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number % 2 == 0) {
            this.number = number;
        }
    }
}
