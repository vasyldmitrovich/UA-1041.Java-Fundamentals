package src.com.softserve.edu03.homework1;

import static src.com.softserve.edu03.homework1.Main.SCANNER;

public class TriangleArea {
    private int side1;
    private int side2;
    private int side3;

    public TriangleArea() {
    }

    public TriangleArea(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void promptTriangleArea(TriangleArea obj) {
        System.out.print("Input Side 1: ");
        int side1 = SCANNER.nextInt();
        obj.setSide1(side1);
        System.out.print("Input Side 2: ");
        int side2 = SCANNER.nextInt();
        obj.setSide2(side2);
        System.out.print("Input Side 3: ");
        int side3 = SCANNER.nextInt();
        obj.setSide3(side3);
    }

    public void printTotalArea() {
        System.out.printf("\nThe area of the triangle is %.2f", areaOfTriangle());
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public double areaOfTriangle() {
        double perimeter = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt((perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3)));
        return area;
    }
}
