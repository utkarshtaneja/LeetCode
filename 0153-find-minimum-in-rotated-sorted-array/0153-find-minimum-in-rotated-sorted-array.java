class Solution {
    public int findMin(int[] nums) {
       // Brute Force method
        // int min = nums[0];
        // for(int i = 1;i < nums.length;i++){
        //     min = Math.min(nums[i],min);
        // }
        // return min;
        
        // Optimal Approach
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}