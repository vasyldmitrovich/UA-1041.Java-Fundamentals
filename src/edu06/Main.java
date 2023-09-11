package edu06;

public class Main {
    public static void main(String[] args) {//Good
        Bird[] birds = {
                new Dove("Dove1"),
                new Swan("Swan1"),
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