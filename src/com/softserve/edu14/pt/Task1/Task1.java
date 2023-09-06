package com.softserve.edu14.pt.Task1;

import java.time.LocalDate;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        var rnd=new Random();
        List<Product>productList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            productList.add(new Product("Manufacturer " + (((i+1)*1000)-((i+1)*234)), "Phone", LocalDate.now().minusYears(2), 10000-(i+1)*500));
        }
        System.out.println(productList);

    }
}
