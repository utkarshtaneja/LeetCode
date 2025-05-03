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
        int fresh = 0;
        int maxtime = 0;

        Queue<Pair> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                else if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }

        int count = 0;
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            int time = curr.time;

            maxtime = Math.max(maxtime, time);
            int dRow[] = {-1, 0, 1, 0};
            int dCol[] = {0, 1, 0, -1};

            for(int i = 0;i < 4;i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if(nRow >= 0 && nCol >= 0 && nRow < n && nCol < m && !vis[nRow][nCol] && grid[nRow][nCol] == 1){
                    count++;
                    vis[nRow][nCol] = true;
                    q.add(new Pair(nRow, nCol, time + 1));
                }
            }
        }

        if(fresh != count) return -1;
        return maxtime;
    }
}