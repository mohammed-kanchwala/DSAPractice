package com.mohammed.dsa.bit_manipulation.medium;

public class SumInteger {
    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return b;
    }
}
