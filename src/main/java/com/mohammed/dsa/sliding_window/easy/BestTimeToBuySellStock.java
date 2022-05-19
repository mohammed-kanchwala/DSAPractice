package com.mohammed.dsa.sliding_window.easy;

public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else {
                sell = Math.max(sell, price - buy);
            }
        }
        return sell;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
