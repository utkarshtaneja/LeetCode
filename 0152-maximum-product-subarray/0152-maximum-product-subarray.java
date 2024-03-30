class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i = 1; i<n; i++) {
            int val = nums[i];
            int temp = max;
            max = Math.max(val, Math.max(nums[i] * max, nums[i] * min) );
            min = Math.min(val, Math.min(nums[i] * temp, nums[i] * min) );
            result = Math.max(result, max);
        }

        return result;
    }
}