class Solution {
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++]; 
            }
        }

        while (i <= mid) ans[k++] = arr[i++];
        while (j <= end) ans[k++] = arr[j++];

        for (int p = 0; p < ans.length; p++) {
            arr[start + p] = ans[p];
        }
    }

    public static int mergeSort(int[] arr, int start, int end) {
        int count = 0;
        if (start < end) {
            int mid = start + (end - start) / 2;
            count += mergeSort(arr, start, mid);
            count += mergeSort(arr, mid + 1, end);
            count += countPairs(arr, start, mid, end);
            merge(arr, start, mid, end);
        }
        return count;
    }

    public static int countPairs(int[] arr, int start, int mid, int end){
        int right = mid + 1;
        int count = 0;
        for (int i = start;i <= mid;i++) {
            while (right <= end && (long)arr[i] > 2L * (long)arr[right]) right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    public int reversePairs(int[] nums) {
        // Brute Force
        // int count = 0;
        // int n = nums.length;
        // for (int i = 0;i < n - 1;i++) {
        //     for (int j = i + 1;j < n;j++) {
        //         if (nums[i] > 2 * nums[j]) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // Optimal
        return mergeSort(nums, 0, nums.length - 1);
    }
}