package org.example;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums={7,6,4,9, 3,1, 9};
        System.out.println(maxProfit(nums));
    }
}
