class Solution {
    public static boolean check(int[] nums){
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean rev(int[] nums){
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] < nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public int findPeakElement(int[] nums) {
        // Brute Force Method
        int n = nums.length;
        if(n == 1) return 0;
        
        boolean checkSorted = check(nums);
        if(checkSorted) return n-1;
        
        boolean reverse = rev(nums);
        if(reverse) return 0;
        for(int i = 1;i < n-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        return 0;
    }
}