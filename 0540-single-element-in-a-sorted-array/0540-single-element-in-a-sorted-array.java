class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        // BRUTE FORCE APPROACH

        // int ans = 0;
        // for(int i = 0;i<n;i++){
        //     ans = ans ^ nums[i];
        // }
        // return ans;

        // OPTIMAL APPROACH

        // (even,odd) -> we are on left half
        // (odd,even) -> we are on right half
        
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
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                ans = nums[mid];
                break;
            }

            // eliminate the left half
            else if( (mid % 2 == 1 && nums[mid] == nums[mid-1]) ||
                     (mid % 2 == 0 && nums[mid] == nums[mid+1]) ){
                low = mid+1;
            }

            // eliminate the right half
            else{
                high = mid-1;
            }
        }

        return ans;
    }
}