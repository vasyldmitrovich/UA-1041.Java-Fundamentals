package com.softserve.edu14.hw.Task1;

import java.util.*;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println(
                list
                .stream()
                .filter(String::isEmpty)
                .count());
        System.out.println(
                list
                .stream()
                .filter(s -> !s.isEmpty())
                .toList());
        System.out.println(
                list
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(",")));

    }
}
