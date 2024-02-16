class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high =  n - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return true;
            }
            // check if low, mid & high are equal
            else if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            // check if left is sorted
            else if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            // check if right is sorted
            else{
                if(nums[high] >= target && target >= nums[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}