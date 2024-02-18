class Solution {
    public static void dfs(int row,int col,int[][] image, int[][] ans, int init, int color, int[] delRow,int[] delCol){
        
        ans[row][col] = color;
        int n = ans.length;
        int m = ans[0].length;
        
        for(int i = 0;i < 4;i++){
            
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];
            
            if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && image[nRow][nCol] == init && ans[nRow][nCol] != color){
                dfs(nRow, nCol, image, ans, init, color, delRow, delCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int init = image[sr][sc];
        int[][] ans = image;
        
        int[] delRow = {-1, 0, +1, 0};
        int[] delCol = {0, +1, 0, -1};
        
        dfs(sr, sc, image, ans, init, color, delRow, delCol);
        return ans;
    }
}