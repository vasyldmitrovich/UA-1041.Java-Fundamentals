package com.softserve.edu5.PT;

import java.util.Arrays;
import java.util.Scanner;

public class PT1 {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String[] zsuCup = {"Sadgora", "Fazenda", "Beregomet", "Brusnitsya"};
        Arrays.sort(zsuCup);
        System.out.println(Arrays.toString(zsuCup));

        Integer[] averageArr = {2, 3, 20, 55};
        int x = 0;
        for (Integer integer : averageArr) {
            x += integer;
        }
        System.out.println(x / averageArr.length);

        System.out.println("Enter name of football club: ");
        String fc = SCANNER.nextLine();
        int check = 0;
        for (int i = 0; i < zsuCup.length; i++) {
            if (zsuCup[i].equals(fc)) {
                check++;
            }
        }
        if (check > 0) {
            System.out.println("This football club play on zsuCup");
        } else {
            System.out.println("This football club not play on zsuCup");
        }
    }
}
