class Solution {
    public int superEggDrop(int k, int n) {
        int[] dp = new int[k+1];
        int moves = 0;
        while(dp[k] < n){
            moves++;
            for(int j = k;j > 0 ;j--){
                dp[j] += 1 + dp[j-1];
            }
        }
        return moves;
    }
}