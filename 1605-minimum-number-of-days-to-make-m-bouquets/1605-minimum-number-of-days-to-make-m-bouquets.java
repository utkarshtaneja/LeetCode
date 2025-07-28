class Solution {
    public static boolean isPossible(int[] arr, int day, int m, int k) {
        int count = 0;
        int noOfB = 0;

        for (int i = 0;i < arr.length;i++) {
            if (arr[i] <= day) count++;
            else {
                noOfB += (count / k);
                count = 0;
            }
        }

        noOfB += (count / k);
        if (noOfB >= m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        // Brute Force
        // int mini = Integer.MAX_VALUE;
        // int maxi = Integer.MIN_VALUE;

        // for (int val : bloomDay) {
        //     maxi = Math.max(maxi, val);
        //     mini = Math.min(mini, val);
        // }

        // if ((long) m * k > bloomDay.length) return -1;
        // for (int i = mini;i <= maxi;i++) {
        //     if (isPossible(bloomDay, i, m, k)) {
        //         return i;
        //     }
        // }
        // return -1;


        // Optimal
        if ((long) m * k > bloomDay.length) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int val : bloomDay) {
            high = Math.max(high, val);
            low = Math.min(low, val);
        }
        
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
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