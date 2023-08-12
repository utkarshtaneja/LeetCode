class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int mini = prices[0];

        for(int i = 0;i<n;i++){
            int profit = prices[i] - mini;
            max = Math.max(profit,max);
            mini = Math.min(mini,prices[i]);
        }

        return max;
    }
}