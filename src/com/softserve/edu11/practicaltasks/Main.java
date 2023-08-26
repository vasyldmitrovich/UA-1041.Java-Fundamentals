package com.softserve.edu11.practicaltasks;

public class Main {
    public static void main(String[] args) {

        //Practical task #1
        promptTask1();

        //Practical task #2
        promptTask2();

        //Practical task #3
        promptTask3();
    }

    private static void promptTask3() {
        String[] users = {"A", "Ababagalamaga", "IhorFrankenshtain", "Bob", "Valera"};
        for (var user : users) {
            System.out.printf("User '%s' is %svalid%n", user, validate(user) ? "" : "in");
        }
    }

    private static void promptTask2() {
        String firstName = "John";
        String lastName = "Smith";
        String middleName = "Anatoliyovych";
        String str1 = "%s %c. %c.".formatted(lastName, firstName.charAt(0), middleName.charAt(0));
        String str2 = "%s %s %s".formatted(firstName, middleName, lastName);
        System.out.println(str1);
        System.out.println(str2);
    }

    private static void promptTask1() {
        String str = "SoftServe Academy";
        String fragmentOfStr = "Academy";
        System.out.println(str.contains(fragmentOfStr));
    }

    public static boolean validate(String username) {
        return username.matches("\\w{3,15}");
    }
}
