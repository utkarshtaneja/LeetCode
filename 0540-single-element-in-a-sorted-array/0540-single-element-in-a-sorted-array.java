class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Brute Force
        // int ans = 0;
        // for(int i = 0;i < nums.length;i++){
        //     ans = ans ^ nums[i];
        // }
        // return ans;
        
        // Optimal Approach        
        int n = nums.length;       
        if(n == 1){
            return nums[0];
        }
        
        if(nums[0] != nums[1]){
            return nums[0];
        }
        
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }
        
        int low = 1;
        int high = n-2;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            else if( (mid % 2 == 1 && nums[mid-1] == nums[mid] ) || 
                     (mid % 2 == 0 && nums[mid] == nums[mid+1] ) ){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
// Play on even and odd index
// (even, odd) -> left half    ---> element is on right half
// (odd, even) -> right half   ---> element is on left half