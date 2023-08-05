package com.softserve.edu05.homeworktasks;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {//Nice very nice

        DaysInMonth day = new DaysInMonth();
        day.promptUserInput(day);

        CalcNumbers obj = new CalcNumbers();
        obj.promptCalcNumber(obj);
    }
}
