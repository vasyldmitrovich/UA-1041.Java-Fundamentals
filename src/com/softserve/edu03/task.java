package lesson_3_Homework;

import java.util.Scanner;

public class task {
    static Scanner SCANNER=new Scanner(System.in);
    /**
     * HalfPerimetr- it is double variable that contains half perimeter which we need for calculation area using the Heron's formula
     * @param Side1 This is first side of triangle
     * @param Side2 This is second side of triangle
     * @param Side3 This is third side of triangle
     * @return area of a triangle
     */
    static double getArea(int Side1,int Side2,int Side3){
        double HalfPerimeter=(double)(Side1+Side2+Side3)/2;
        return Math. sqrt(HalfPerimeter*(HalfPerimeter-Side1)*(HalfPerimeter-Side2)*(HalfPerimeter-Side3));
    }

    /**
     *
     * @param txt-variable that contains the text that is output to the console before entering the value
     * @return scanned number entered by user
     */
    static int getNumber(String txt){
        System.out.print(txt);
        return SCANNER.nextInt();
    }

    public static void main(String[] args) {
        var First=(getNumber("First side: "));
        var Second=(getNumber("Second side: "));
        var Third=(getNumber("Third side: "));
        var area=getArea(First,Second,Third);
        System.out.println("The area of a triangle is "+area);
    }
}
