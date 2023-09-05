package com.softserve.edu11.pt.task3;


public class App {
    public static void main(String[] args) {
        String[] users = {
                "asdasdasd76213asd",
                "asfasfa23_",
                "Bi",
                "forcezkiy",
                "sdfhs fasd"
        };
        for (var user : users) {
            System.out.printf("User %s is %svalid\n", user, validate(user) ? "" : "in");
        }

    }

    public static boolean validate(String s) {
        return s.matches("\\w{3,15}");
    }
}
