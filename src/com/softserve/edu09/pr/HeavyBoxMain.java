package com.softserve.edu09.pr;

import java.util.ArrayList;
import java.util.List;

public class HeavyBoxMain {
    public static void main(String[] args) {
        List<HeavyBox> dynamic = new ArrayList<>();
        dynamic.add(new HeavyBox(1, "A"));
        dynamic.add(new HeavyBox(1, "B"));
        dynamic.add(new HeavyBox(2, "B"));
        dynamic.add(new HeavyBox(2, "C"));
        dynamic.add(new HeavyBox(1, "C"));
        dynamic.add(new HeavyBox(3, "D"));
        System.out.println(dynamic);
        var el = dynamic.get(0);
        el.setWeight(el.getWeight()+1);
        System.out.println(dynamic);
        dynamic.remove(dynamic.size()-1);
        System.out.println(dynamic);
        dynamic.clear();
        System.out.println(dynamic);
    }
}
