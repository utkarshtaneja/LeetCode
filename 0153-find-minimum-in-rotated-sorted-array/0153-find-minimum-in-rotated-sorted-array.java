class Solution {
    public int findMin(int[] nums) {
        // BRUTE FORCE METHOD
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}