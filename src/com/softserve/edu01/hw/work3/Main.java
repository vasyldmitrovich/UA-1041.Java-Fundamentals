package com.softserve.edu01.hw.work3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double c1, c2, c3;
    double t1, t2, t3;
    double v1, v2, v3; // вартість
        double cost; // загальна вартість

        System.out.println("Введіть вартість хвилини першого дзвінка: ");
        Scanner scanner = new Scanner(System.in);
        c1 = scanner.nextDouble();
        System.out.println("Введіть вартість хвилини другого дзвінка: ");
        c2 = scanner.nextDouble();
        System.out.println("Введіть вартість хвилини третього дзвінка: ");
        c3 = scanner.nextDouble();

        System.out.println("Введіть тривалість першого дзвінка: ");
        t1 = scanner.nextDouble();
        System.out.println("Введіть тривалість другого дзвінка: ");
        t2 = scanner.nextDouble();
        System.out.println("Введіть тривалість третього дзвінка: ");
        t3 = scanner.nextDouble();

        v1 = c1 * t1;
        v2 = c2 * t2;
        v3 = c3 * t3;
        cost = v1 + v2 + v3;

        System.out.println("Вартість першого дзвінка: " + v1);
        System.out.println("Вартість другого дзвінка: " + v2);
        System.out.println("Вартість третього дзвінка: " + v2);
        System.out.println("Загальна варість: " + cost);
    }
}