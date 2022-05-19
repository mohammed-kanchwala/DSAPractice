package com.mohammed.dsa.dynamic_programming.easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    static int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        return climbStairs(n, memo);
    }

    private static int climbStairs(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1;
        memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
