package com.softserve.edu09.practicaltask2;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        RemoveDuplicate duplicateNum = new RemoveDuplicate();
        duplicateNum.promptNumbers();
        duplicateNum.removeDup();
    }
}
