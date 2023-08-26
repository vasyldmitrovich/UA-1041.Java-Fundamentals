package com.softserve.edu11.hm;

import java.util.Scanner;

public class OneSpaceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new OneSpace().removeExtraSpaces(sc.nextLine()));
    }
}
