package com.softserve.edu14.pt.task1;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        System.out.println(list);

        System.out.println("Count of empty lines:" + list.stream().filter(String::isEmpty).count());

        List<String> noEmptyList = list.stream().filter(s->!s.isEmpty()).toList();

        System.out.println("No empty lines:" + noEmptyList);


        System.out.println("String to uppercase and Join them with coma: " + String.join(", ", noEmptyList.stream().map(String::toUpperCase).toList()));

    }


}
