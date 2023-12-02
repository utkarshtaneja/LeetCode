class Solution {
    public int findMin(int[] nums) {
       // Brute Force method
        int min = nums[0];
        for(int i = 1;i < nums.length;i++){
            min = Math.min(nums[i],min);
        }
        return min;
    }
}