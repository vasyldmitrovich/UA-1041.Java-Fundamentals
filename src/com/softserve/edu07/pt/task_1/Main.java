package com.softserve.edu07.pt.task_1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals={
                new Cat("Murzik"),
                new Dog("Sharik")
        };
        for (var el:animals
             ) {
            System.out.println(el);
            el.voice();
            el.feed();
        }
    }
}
