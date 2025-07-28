class Solution {
    public static int noOfDays(int[] arr, int capacity) {
        int day = 1;
        int load = 0;

        for (int i = 0;i < arr.length;i++) {
            if (load + arr[i] > capacity) {
                day++;
                load = arr[i];
            }
            else {
                load += arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        // Brute Force
        // int mini = Integer.MIN_VALUE;
        // int maxi = 0;

        // for (int weight : weights) {
        //     mini = Math.max(mini, weight);
        //     maxi += weight;
        // }

        // for (int i = mini;i <= maxi;i++) {
        //     int daysRequired = noOfDays(weights, i);
        //     if (daysRequired <= days) {
        //         return i;
        //     }
        // }
        // return -1;

        // Optimal
        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int daysRequired = noOfDays(weights, mid);
            if (daysRequired <= days) {
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