class Solution {
    public static void dfs(int row,int col,int[][] vis, int[][] grid, int[] dRow, int[] dCol){
        vis[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0;i < 4;i++){
            int nRow = row + dRow[i];
            int nCol = col + dCol[i];
            
            if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && vis[nRow][nCol] == 0 && grid[nRow][nCol] == 1){
                dfs(nRow, nCol, vis, grid, dRow, dCol);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        
        int[] dRow = {-1, 0, +1, 0};
        int[] dCol = {0, +1, 0, -1};
        
        for(int j = 0;j < m;j++){
            // 1st row
            if(vis[0][j] == 0 && grid[0][j] == 1){
                dfs(0, j, vis, grid, dRow, dCol);
            }
            
            // last row
            if(vis[n-1][j] == 0 && grid[n-1][j] == 1){
                dfs(n-1, j, vis, grid, dRow, dCol);
            }
        }
        
        for(int i = 0;i < n;i++){
            // 1st col
            if(vis[i][0] == 0 && grid[i][0] == 1){
                dfs(i, 0, vis, grid, dRow, dCol);
            }
            
            // last col
            if(vis[i][m-1] == 0 && grid[i][m-1] == 1){
                dfs(i, m-1, vis, grid, dRow, dCol);
            }
        }
        
        int count = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(vis[i][j] == 0 && grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}