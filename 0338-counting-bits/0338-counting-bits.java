class Solution {
    public static int countones(int n){
        int ans = 0;
        while(n > 0){
            int bit = n & 1;
            if(bit == 1){
                ans++;
            }
            n = n >> 1;
        }
        return ans;
    }
    public int[] countBits(int n) {
        // Brute Force
        // int[] ans = new int[n+1];
        // for(int i = 0;i<ans.length;i++){
        //     ans[i] = countones(i);
        // }
        // return ans;

        // Optimized Approach
        int[] ans = new int[n+1];
        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}