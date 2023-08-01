package com.softserve.edu04.hw;

public class MinAndMax {

public static void findMinAndMax(int... nums){
    int min = nums[0];
    int max = nums[0];

    for (int num:nums
         ) {
        min=min>num?num:min;
        max=max<num?num:max;
    }
    System.out.println("Min: "+min);
    System.out.println("Max: "+max);
}
}
