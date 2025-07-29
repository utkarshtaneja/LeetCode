class Solution {
    public static int getPaintersRequired(int[] nums, int maxLengthPerPainter) {
        int painters = 1;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] <= maxLengthPerPainter) {
                currentSum += nums[i];
            } 
            else {
                painters++;
                currentSum = nums[i];
            }
        }
        return painters;
    }
    public int splitArray(int[] nums, int k) {
        // Brute Force
        
        // if (k > nums.length) return -1;

        // int low = Integer.MIN_VALUE;
        // int high = 0;
        
        // for (int val : nums) {
        //     low = Math.max(low, val);
        //     high += val;
        // }
        
        // for (int i = low;i <= high;i++) {
        //     int count = getPaintersRequired(nums, i);
        //     if (count <= k) return i;
        // }
        // return -1;
        
        // Optimal
        if (k > nums.length) return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;
        
        for (int val : nums) {
            low = Math.max(low, val);
            high += val;
        }
        
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = getPaintersRequired(nums, mid);
            if (count <= k) {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}