class Solution {
    public int[] sortedSquares(int[] nums) {
        // Brute Force
        // int n = nums.length;
        // int[] ans = new int[n];
        // for(int i = 0;i < n;i++){
        //     ans[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(ans);
        // return ans;
        
        // Optimal 
        int n = nums.length;
        int[] ans = new int[n];
        
        int i = 0;
        int j = n - 1;
        int index = n - 1;
        
         while(i <= j){
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];
            
            if(val1 > val2){
                ans[index] = val1;
                i++;
            }
            else{
                ans[index] = val2;
                j--;
            }
            index--;
        }
        return ans;
    }
}