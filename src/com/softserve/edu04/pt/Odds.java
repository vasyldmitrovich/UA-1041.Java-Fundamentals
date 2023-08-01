package com.softserve.edu04.pt;

class Odds {

    protected static int calcOdds(float... nums) {
        int count = 0;
        for (float num : nums
        ) {
            count += num % 2 != 0 ? 1 : 0;
        }
        return count;
    }

}

