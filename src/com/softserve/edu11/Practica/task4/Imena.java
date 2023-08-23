package com.softserve.edu11.Practica.task4;

public class Imena {
    public static void main(String[] args) {
        String[] users = {
                "Alyona", "Eva", "Asimanitorish",
                "Gorge!&", "Dmit%ro"
        };
        for (var user : users) {
            System.out.printf("User '%s' is %svalid%n",
                    user, validate(user) ? "" : "in");
        }

    }
    public static boolean validate(String username) {
        return username.matches("\\w{3,15}");
    }
}


