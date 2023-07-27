package src.com.softserve.edu03.homework1;

import static src.com.softserve.edu03.homework1.Main.SCANNER;

public class SmallestNumber {

    private int numberOne;
    private int numberTwo;
    private int numberThree;

    public SmallestNumber() {
    }

    public SmallestNumber(int numberOne, int numberTwo, int numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    public static void promptSmallestNum(SmallestNumber obj1) {
        System.out.print("Input the first number: ");
        int num1 = SCANNER.nextInt();
        obj1.setNumberOne(num1);
        System.out.print("Input the second number: ");
        int num2 = SCANNER.nextInt();
        obj1.setNumberTwo(num2);
        System.out.print("Input the third number: ");
        int num3 = SCANNER.nextInt();
        obj1.setNumberThree(num3);
    }

    public void printSmallestNum() {
        System.out.printf("\nThe smallest number is %s ", smallestNum());
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(int numberThree) {
        this.numberThree = numberThree;
    }

    public int smallestNum() {
        int sNum = 0;
        if (numberOne < numberTwo && numberOne < numberThree) {
            sNum = numberOne;
        } else {
            if (numberTwo < numberThree) {
                sNum = numberTwo;
            } else {
                sNum = numberThree;
            }
        }
        return sNum;
    }
}
