class Solution {
    public static boolean cornerCase(int i, int j, int n, int m){
        if((i == 0) || (j == 0) || (i == n - 1) || (j == m - 1)) return true;
        return false;
    }
    public static void dfs(int row, int col, int n, int m, boolean[][] vis, int[][] grid){
        vis[row][col] = true;

        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        for(int i = 0;i < 4;i++){
            int nRow = row + dRow[i];
            int nCol = col + dCol[i];

            if(nRow >= 0 && nCol >= 0 && nRow < n && nCol < m && !vis[nRow][nCol] && grid[nRow][nCol] == 1){
                dfs(nRow, nCol, n, m, vis, grid);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(cornerCase(i, j, n, m) && grid[i][j] == 1){
                    dfs(i, j, n, m, vis, grid);
                }
            }
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    count++;
                }
            }
        }

        return count;
    }
}