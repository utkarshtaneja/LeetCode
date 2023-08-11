class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        int sum = 0;

        int row = accounts.length;
        int col = accounts[0].length;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                sum = sum + accounts[i][j];
            }
            ans = Math.max(sum,ans);
            sum = 0;
        }
        return ans;
    }
}