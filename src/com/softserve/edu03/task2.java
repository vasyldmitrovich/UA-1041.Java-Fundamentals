package com.softserve.edu03;
//In first line was bad package
import java.util.Scanner;

public class task2 {//program for finding the maximum and minimum for a dynamic array of numbers
    static Scanner SCANNER=new Scanner(System.in);

    /**
     * create the minimum variable and transfer the largest possible number for the int type, create a cycle and in it compare whether the number from the array is greater than our minimum, if so, then assign the minimum variable the value of the element of the array that turned out to be greater than the minimum variable
     * @param array it's array of numbers which we are looking for the minimum
     * @param n it's a variable that represents how many elements are in the array
     * @return we are return the smallest number in the array
     */
    static int getmin(int []array,int n) {
        int min = Math.toIntExact(Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        return min;
    }

    /**
     * create the maximum variable and transfer the smallest possible number for the int type, create a cycle and in it compare whether the number from the array is greater than our maximum, if so, then assign the maximum variable the value of the element of the array that turned out to be greater than the maximum variable
     * @param array it's array of numbers which we are looking for the maximum
     * @param n it's a variable that represents how many elements are in the array
     * @return we are return the largest number in the array
     */
    static int getmax(int []array,int n) {

        int max = Math.toIntExact(Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
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

    public static void main(String[] args) {//program for finding the maximum and minimum for a dynamic array of numbers
        var n=(getNumber("Введіть число яке буде означати кількість чисел: "));
        int[] dynamicArray = new int[n];
        for (int i=0;i<n;i++){
            dynamicArray[i] = getNumber("число № " + (i + 1) + " ");
        }
        var max=getmax(dynamicArray,n);
        var min=getmin(dynamicArray,n);
        System.out.println("max: "+(max));
        System.out.println("min: "+(min));
    }

//program for finding the maximum and minimum for a dynamic array of numbers

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class  task2n{//program for finding the largest and smallest of 3 numbers
    static Scanner SCANNER=new Scanner(System.in);

    /**
     * compare 3 numbers
     * @param firstNum first number
     * @param secondNum second number
     * @param thirdNum third number
     * @return the largest number
     */
    static int getmax(int firstNum,int secondNum,int thirdNum) {
        if(firstNum>secondNum && firstNum>thirdNum) {
            return firstNum;
        }
        if(secondNum>firstNum && secondNum>thirdNum) {
            return secondNum;
        }
        if(thirdNum>secondNum && thirdNum>firstNum) {
            return thirdNum;
        }
        else
            return 0;
    }

    /**
     * compare 3 numbers
     * @param firstNum first number
     * @param secondNum second number
     * @param thirdNum third number
     * @return the smallest number
     */
    static int getmin(int firstNum,int secondNum,int thirdNum) {
        if(firstNum<secondNum && firstNum<thirdNum) {
            return firstNum;
        }
        if(secondNum<firstNum && secondNum<thirdNum) {
            return secondNum;
        }
        if(thirdNum<secondNum && thirdNum<firstNum) {
            return thirdNum;
        }
        else
            return 0;
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

    public static void main(String[] args) {//program for finding the largest and smallest of 3 numbers
        var first=getNumber("first: ");
        var second=getNumber("second: ");
        var third=getNumber("third: ");

        var max=getmax(first,second,third);
        var min=getmin(first,second,third);
        System.out.println("max: "+(max));
        System.out.println("min: "+(min));
    }

//program for finding the largest and smallest of 3 numbers

}


