package com.softserve.edu11.pr;

import java.util.Scanner;

public class Fragment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        System.out.println(line2.contains(line1));
    }
}
