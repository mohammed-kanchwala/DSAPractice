package com.mohammed.dsa.dynamic_programming.easy;

import java.util.Arrays;

public class MaximumProductSubArray {

    public static int maxProduct(int[] nums) {
        int res = Arrays.stream(nums).max().getAsInt();
        int curMin = 1;
        int curMax = 1;
        for (int n : nums) {
            int temp = curMax * n;
            curMax = Math.max(n * curMax, n * curMin);
            curMax = Math.max(curMax, n);

            curMin = Math.min(temp, n * curMin);
            curMin = Math.min(curMin, n);
            res = Math.max(res, curMax);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
    }
}
