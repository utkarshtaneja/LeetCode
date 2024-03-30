class Solution {
    public int candy(int[] ratings) {
        int N = ratings.length;
        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        
        for(int i = 1; i < N; i++) {
            if(ratings[i] > ratings[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        for(int i = N - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1] && dp[i] <= dp[i + 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        
        int totalCandies = 0;
        for(int candy : dp) {
            totalCandies += candy;
        }
        
        return totalCandies;
    }
}