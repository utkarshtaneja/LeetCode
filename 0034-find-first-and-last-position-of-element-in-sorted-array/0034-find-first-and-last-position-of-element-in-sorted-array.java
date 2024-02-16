class Solution {
    public static int first(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int last(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int start = first(nums, target);
        if(start == -1){
            return new int[]{-1, -1};
        }
        int end = last(nums, target);
        return new int[]{start, end};
    }
}