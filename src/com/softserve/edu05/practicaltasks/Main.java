package com.softserve.edu05.practicaltasks;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Array array = new Array();
        array.promptStringArray(array);

        AverageValue obj = new AverageValue();
        obj.promptAverageValue(obj);

    }
}
