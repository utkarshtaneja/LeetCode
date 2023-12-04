class Solution {
    public int findPeakElement(int[] nums) {
        // Brute Force Method
        int n = nums.length;
        if(n == 1) return 0;

        for(int i = 0;i < n;i++){
            if( (i == 0 || nums[i-1] < nums[i]) &&
                (i == n-1) || nums[i] > nums[i+1]){
                return i;
            }
        }
        return 0;
    }
}