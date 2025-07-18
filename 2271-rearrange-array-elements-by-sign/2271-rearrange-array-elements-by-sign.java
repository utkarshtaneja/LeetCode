class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Brute Force
        // int n = nums.length;

        // int[] pos = new int[n/2];
        // int[] neg = new int[n/2];
        // int i = 0;
        // int j = 0;
        // for(int val : nums){
        //     if(val > 0){
        //         pos[i] = val;
        //         i++;
        //     }
        //     else{
        //         neg[j] = val;
        //         j++;
        //     }
        // }

        // for(int p = 0;p < n / 2;p++){
        //     nums[2*p] = pos[p];
        //     nums[2*p + 1] = neg[p];
        // }

        // return nums;

        // Optimal
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;

        for(int val : nums){
            if(val > 0){
                ans[pos] = val;
                pos += 2;
            }
            else{
                ans[neg] = val;
                neg += 2; 
            }
        }

        return ans;
    }
}