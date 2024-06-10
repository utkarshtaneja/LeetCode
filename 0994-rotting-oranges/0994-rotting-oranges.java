class Solution {
    static class Pair{
        int row;
        int col;
        int time;
        
        public Pair(int row, int col, int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] vis = new int[n][m];
        int fresh = 0;
        
        Queue<Pair> q = new LinkedList<>();
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
                else{
                    vis[i][j] = 0;
                }
            }
        }
        
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        
        int max = 0;
        int check = 0;
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            int time = curr.time;
            
            max = Math.max(time, max);
            
            for(int i = 0;i < 4;i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];
                
                if(nRow >= 0 && nCol >= 0 && nRow < n && nCol < m && vis[nRow][nCol] == 0 && grid[nRow][nCol] == 1){
                    vis[nRow][nCol] = 2;
                    q.add(new Pair(nRow, nCol, time + 1));
                    check++;
                }
            }
        }
        
        if(check != fresh) return -1;
        return max;
    }
}