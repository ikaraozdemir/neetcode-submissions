class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int oldProfit = 0;
        int buy = 0;

        for (int i=0; i < prices.length; i++) {

            if (i == 0) {
                buy = prices[i];
            }

           else if (prices[i] < buy) {
                buy = prices[i];
            }

            if (i > 0 && prices[i] - buy > profit) {
                oldProfit = profit;
                profit = prices[i] - buy;
            }

        }

        return profit;
        
    }
}
