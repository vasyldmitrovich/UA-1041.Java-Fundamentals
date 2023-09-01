package com.softserve.edu12.pt.task_2;

public class Main {
    public static void main(String[] args) {
        Plant[] plants={new Plant(200,"red","grass"),
                new Plant(100,"yellow","grass"),
                new Plant(50,"blue","bush"),
                new Plant(199,"red","tree"),
                new Plant(100,"violet","grass")
        };
        for (var el: plants
             ) {
            System.out.println(el);
        }
    }
}
