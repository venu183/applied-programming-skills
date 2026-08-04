class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price seen so far
            minPrice = Math.min(minPrice, price);

            // Calculate potential profit
            int potentialProfit = price - minPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }
}