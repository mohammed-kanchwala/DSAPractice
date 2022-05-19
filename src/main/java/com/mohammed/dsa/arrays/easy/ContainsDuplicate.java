package com.mohammed.dsa.arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
//        return Arrays.stream(nums).distinct().count() != nums.length;
        Set<Integer> numbers = new HashSet<>();
        for (int n : nums) {
            if (numbers.contains(n)) return true;
            numbers.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 1}));
    }
}
