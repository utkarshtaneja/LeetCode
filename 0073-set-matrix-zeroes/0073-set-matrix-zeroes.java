class Solution {
    public static void dfs(int row, int col, int[][] matrix, boolean[][] vis){
        int n = matrix.length;
        int m = matrix[0].length;

        // Mark row
        for (int j = 0; j < m; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = 0;
                vis[row][j] = true;
            }
        }

        // Mark column
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = 0;
                vis[i][col] = true;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] vis = new boolean[n][m];
        for (int i = 0;i < n;i++) {
            Arrays.fill(vis[i], false);
        }

        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                if (matrix[i][j] == 0 && !vis[i][j]) {
                    dfs(i, j, matrix, vis);
                }
            }
        }
    }
}