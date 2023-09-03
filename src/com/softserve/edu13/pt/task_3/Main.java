package com.softserve.edu13.pt.task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>(Arrays.asList("qwer","asdf","hrthr","htwr","wgdfg"));
        System.out.println(strings);
        strings.sort(Comparator.naturalOrder());
        System.out.println(strings);

    }
}
