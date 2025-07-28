class Solution {
    public static boolean isPossible(int[] arr, int divisor, int threshold) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0;i < n;i++) {
            int value = (arr[i] + divisor - 1) / divisor;
            sum += value;
        }

        if (sum <= threshold) return true;
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        // Brute Force
        // int maxi = Integer.MIN_VALUE;
        // int mini = 1;

        // for (int val : nums) {
        //     maxi = Math.max(maxi, val);
        // }

        // for (int i = mini;i <= maxi;i++) {
        //     if (isPossible(nums, i, threshold)) return i;
        // }
        // return -1;

        // Optimal
        int low = 1;
        int high = Integer.MIN_VALUE;

        for (int val : nums) {
            high = Math.max(high, val);
        }

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, threshold)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}