class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1;i<nums.length;i++){
            int s = currentSum + nums[i];
            currentSum = Math.max(nums[i], s);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}