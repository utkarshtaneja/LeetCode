class Solution {
    public static boolean find(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // Brute Force
        // int n = matrix.length;
        // int m = matrix[0].length;

        // for (int i = 0;i < n;i++) {
        //     for (int j = 0;j < m;j++) {
        //         if (matrix[i][j] == target) return true;
        //     }
        // }
        // return false;

        // Better
        // int n = matrix.length;

        // for (int i = 0;i < n;i++) {
        //     if (find(matrix[i], target)) {
        //         return true;
        //     }
        // }
        // return false;

        // Optimal
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else{
                row++;
            }
        }
        return false;
    }
}