package com.softserve.edu11.pt;

public class Task_2 {
    public static void printNames(String lastName, String firstName, String middleName) {
        var ln = new StringBuilder();
        ln.append(Character.toTitleCase(lastName.charAt(0)));
        ln.append(lastName.substring(1).toLowerCase());
        var fn = new StringBuilder();
        fn.append(Character.toTitleCase(firstName.charAt(0)));
        var mn = new StringBuilder();
        mn.append(Character.toTitleCase(middleName.charAt(0)));
        System.out.println(ln + " " + fn + "." + mn + ".");

        fn.append(firstName.substring(1).toLowerCase());
        System.out.println(fn);

        mn.append(middleName.substring(1).toLowerCase());
        System.out.println(fn + " " + mn + " " + ln);
    }
}
