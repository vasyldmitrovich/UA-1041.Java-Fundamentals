package src.com.softserve.edu03.homework1;

import java.util.Scanner;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        TriangleArea obj = new TriangleArea();
        TriangleArea.promptTriangleArea(obj);
        obj.printTotalArea();

        System.out.println("\n-------------------------------");

        SmallestNumber obj1 = new SmallestNumber();
        SmallestNumber.promptSmallestNum(obj1);
        obj1.printSmallestNum();
    }
}
