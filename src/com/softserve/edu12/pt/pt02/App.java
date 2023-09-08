package com.softserve.edu12.pt.pt02;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Plain> plants = new ArrayList<>();
        plants.add(new Plain(5, String.valueOf(Color.GREEN), String.valueOf(Type.BUSH)));
        plants.add(new Plain(56, String.valueOf(Color.RED), String.valueOf(Type.TREE)));
        plants.add(new Plain(6, String.valueOf(Color.BROWN), String.valueOf(Type.LAVA_PLAINS)));
        plants.add(new Plain(15, String.valueOf(Color.WHITE), String.valueOf(Type.FLOWERS)));
        plants.add(new Plain(8, String.valueOf(Color.YELLOW), String.valueOf(Type.GRASS)));

        System.out.println(plants);

    }
}
