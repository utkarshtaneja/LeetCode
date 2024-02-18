class Solution {
    public static void dfs(int row,int col,int[][] ans,int[][] image,int color,int[] delRow,int[] delCol,int init){
        ans[row][col] = color;
        int n = image.length;
        int m = image[0].length;
        
        for(int i = 0;i < 4;i++){
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];
            if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && image[nRow][nCol] == init && ans[nRow][nCol] != color){
                dfs(nRow, nCol, ans, image, color, delRow, delCol, init);
            }
        } 
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        // Code here 
        int init = image[sr][sc];
        int[][] ans = image;
        
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};
        dfs(sr, sc, ans, image, color, delRow, delCol, init);
        return ans;
    }
}