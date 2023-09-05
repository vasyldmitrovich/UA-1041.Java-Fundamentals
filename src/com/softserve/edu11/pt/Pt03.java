package com.softserve.edu11.pt;

public class Pt03 {
    public static void main(String[] args) {
        String[] users = {
                "AndreyKagaml",
                "Shadozx",
                " Andrii Synytsia",
                "Nikolay Vergeles",
                "annakachmarchyk"
        };
        for (var user : users) {
            System.out.printf("User '%s' is %svalid%n",
                    user, validate(user) ? "" : "in"
            );
        }
    }

    public static boolean validate(String username) {
        return username.matches("\\w{3,15}");
    }
}
