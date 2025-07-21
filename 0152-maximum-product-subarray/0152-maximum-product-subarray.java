class Solution {
    public int maxProduct(int[] nums) {
        // Brute Force
        // int n = nums.length;
        // int ans = Integer.MIN_VALUE;
        // for (int i = 0;i < n;i++) {
        //     int prod = 1;
        //     for (int j = i;j < n;j++) {
        //         prod *= nums[j];
        //         ans = Math.max(ans, prod);
        //     }
        // }
        // return ans;

        // Optimal
        int n = nums.length;
        int ans = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];

        for (int i = 1; i < n; i++) {
            int temp = maxProd;
            maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
            minProd = Math.min(nums[i], Math.min(temp * nums[i], minProd * nums[i]));
            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
}