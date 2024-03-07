class Solution {
    static class Pair{
        int first;
        int second;
        
        public Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void dfs(int row, int col, int[][] vis, char[][] grid){
        vis[row][col] = 1;
        int[] drow = { -1, 0, 1, 0 }; 
        int[] dcol = { 0, 1, 0, -1 }; 
        vis[row][col] = 1;

        for(int i = 0; i < 4; i++) { 
            int nrow = row + drow[i];
            int ncol = col + dcol[i];

            if(nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && 
                grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                dfs(nrow, ncol, vis, grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int count = 0;
        int[][] vis = new int[n][m];
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(vis[i][j] == 0 && grid[i][j] == '1'){
                    count++;
                    dfs(i, j, vis, grid);
                }
            }
        }
        return count;
    }
}