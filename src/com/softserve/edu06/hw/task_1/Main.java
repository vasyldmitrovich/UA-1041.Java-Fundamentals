package com.softserve.edu06.hw.task_1;

public class Main {
    public static void main(String[] args) {//Good
        Bird[] birds = {
                new Eagle("Eagle1"),
                new Eagle("Eagle2"),
                new Swallow("Swallow1"),
                new Penguin("Penguin1"),
                new Penguin("Penguin2"),
                new Kiwi("Kiwi1")
        };
        for (var el : birds
        ) {
            System.out.println(el);
            el.fly();
        }
    }
}
