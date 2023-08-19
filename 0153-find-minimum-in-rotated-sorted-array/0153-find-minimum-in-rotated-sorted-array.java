class Solution {
    public int findMin(int[] nums) {
        // BRUTE FORCE METHOD
        // int min = Integer.MAX_VALUE;
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i] < min){
        //         min = nums[i];
        //     }
        // }
        // return min;

        // OPTIMAL APPROACH
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