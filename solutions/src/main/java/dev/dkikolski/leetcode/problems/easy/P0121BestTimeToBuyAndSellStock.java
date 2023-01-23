package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

@Easy
public class P0121BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int currentPrice : prices) {
            if (currentPrice < lowestPrice) {
                lowestPrice = currentPrice;
            } else if (maxProfit < currentPrice - lowestPrice) {
                maxProfit = currentPrice - lowestPrice;
            }
        }
        return maxProfit;
    }
}
