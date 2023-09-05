package com.softserve.edu12.pt.task2;

public class App {
    public static void main(String[] args) {
        Plant[] plants = {
                new Plant(2, "Pink", "Tree"),
                new Plant(5, "BluE", "Grass"),
                new Plant(1, "RED", "Bush"),
                new Plant(1, "Pink", "Bush"),
                new Plant(1, "Black", "Bush"),
        };

        for (var pl : plants) {
            System.out.println(pl);
        }
    }
}

