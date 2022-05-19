package com.mohammed.dsa.arrays.medium;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        Arrays.fill(result, 1);

        int prefix = 1;
        for (int i = 0; i < size; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = size - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}
