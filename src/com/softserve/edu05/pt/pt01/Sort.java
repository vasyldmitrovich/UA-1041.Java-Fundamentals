package com.softserve.edu05.pt.pt01;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String[] strings = {"first", "third", "second"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
