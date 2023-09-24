package com.softserve.edu11.pt;

import com.softserve.edu10.pt.Task_1;

import java.util.regex.*;

public class Task_3 {

    public static void message() {
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            var userName = Task_1.getName();
            getTemplate(userName);
        }
    }

    public static void getTemplate(String userName) {
        Pattern p = Pattern.compile("[\\w_+]{3,15}");
        boolean answer = false;
        if (userName.matches(String.valueOf(p))) {
            answer = true;
        }
        System.out.println("User name checking result: " + answer + ".");
    }
}
