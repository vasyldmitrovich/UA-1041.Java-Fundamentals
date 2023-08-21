package com.softserve.edu09.pt.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String Line=scanner.nextLine();
        String[] number=Line.split(",\\s*");
        List<Integer> integerList=new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            var element=Integer.parseInt(number[i]);
            if(!(integerList.contains(element))) {
                integerList.add(element);

            }
        }
        System.out.println(integerList);
    }
}
