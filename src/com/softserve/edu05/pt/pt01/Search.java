package com.softserve.edu05.pt.pt01;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        String[] strings = {"first", "third", "second"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        var searchPosition = sc.nextLine();
        var ix = search(strings, searchPosition);
        if (ix < 0) {
            System.out.println("Not found");
        } else {
            System.out.println("is found in position " + ix);
        }
    }

    static int search(String[] data, String key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(key)) return i;
        }
        return -1;
    }
}

