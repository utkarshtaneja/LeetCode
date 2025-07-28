class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Brute Force
        // int n = arr.length;
        // for (int i = 0;i < n;i++) {
        //     if (arr[i] <= k) k++;
        //     else {
        //         break;
        //     }
        // }
        // return k;

        // Optimal
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - mid - 1;

            if (missing < k) low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return (low + k) | (high + k + 1);
    }
}