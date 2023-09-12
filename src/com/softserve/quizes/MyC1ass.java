package com.softserve.quizes;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class MyC1ass implements Serializable {
    public enum TrafficLights {
        RED, YELLOW, GREEN;

        public TrafficLights next() {
            if (this == TrafficLights.RED) return TrafficLights.YELLOW;
            else if (this == TrafficLights.YELLOW) return TrafficLights.GREEN;
            else if (this == TrafficLights.GREEN) return TrafficLights.YELLOW;
            else return TrafficLights.RED;
        }
    }


    public static void main(String[] args) throws IOException {
        String obj = "abc";
        byte b[] = obj.getBytes();
        ByteArrayInputStream obj1 = new ByteArrayInputStream(b);
        for (int i = 0; i < 2; ++ i) {
            int c;
            while ((c = obj1.read()) != -1) {
                if (i == 0) {
                    System.out.print((char)c);
                }
            }
        }
        InputStream obj2= new FileInputStream("data.txt");
        System.out.print(obj1.available());

        LocalDate date=LocalDate.of(2020,9,1);
        date.plusDays(5).minusWeeks(3);
        date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);

        Set<Object> set = new HashSet<>();
        set.add("null");
        set.add(null);
        set.add(null);
        set.add(10);
        set.add("10");
        set.forEach(System.out::println);
        System.out.println(set);


        Integer k1 = 1;
        Integer k2 = 1;
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(k1, "dfgdgf");
        map1.put(k2, "rthdrth");
        System.out.println(map1);

        for (var el : map1.keySet()) {
            System.out.println(map1.get(el));
        }
        System.out.println("dkfvjhdkjfvh");
        List<String> list1 = new ArrayList<>(Arrays.asList("F", "D", "c"));
        list1.set(0, "D");
        System.out.println(list1);
        list1.clear();
        List<String> list2 = List.of("F");

        System.out.println(list2);

        System.out.println(list1);
        Int1 int1 = new Class2(5);
        Class1 c2 = (Class1) new Class1();
        Class1 c1 = new Class2(2);
        TrafficLights color = TrafficLights.RED;
        color.next();  // Assign the result of next() back to the variable
        int[] a = {1, 2, 3, 4, 5};

        double res = 0;
        for (int j = 0; j < a.length; j++) {
            res += res + a[j];
            System.out.println(res);
        }
        System.out.println(res / a.length);


        int i = 0;

        int[][] x = new int[2][];
        x[0] = new int[2];
        switch (color) {
            case RED:
                System.out.print("Stop");
                break;
            case YELLOW:
                System.out.print("Wait");

            case GREEN:
                System.out.print("Go");
                break;
            default:
                System.out.print("Do nothing");
                break;  // Adding a break for the default case
        }
    }
}
