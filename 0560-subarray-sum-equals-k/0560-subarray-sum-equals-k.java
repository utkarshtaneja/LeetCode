class Solution {
    public int subarraySum(int[] nums, int k) {
        // Brute Force
        // int count = 0;
        // int n = nums.length;

        // for (int i = 0;i < n;i++) {
        //     for (int j = i;j < n;j++) {
        //         int sum = 0;
        //         for (int p = i;p <= j;p++) {
        //             sum += nums[p];
        //         }
        //         if (sum == k) count++;
        //     }
        // }

        // return count;

        // Better
        int count = 0;
        int n = nums.length;

        for (int i = 0;i < n;i++) {
            int sum = 0;
            for (int j = i;j < n;j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }

        return count;
    }
}