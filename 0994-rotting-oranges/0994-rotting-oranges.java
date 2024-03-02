class Solution {
    static class Pair {
        int row;
        int col;
        int time;

        public Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } 
                else {
                    vis[i][j] = 0;
                }
            }
        }

        int[] dRow = {-1, 0, +1, 0};
        int[] dCol = {0, +1, 0, -1};

        int time = 0;
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            int t = curr.time;
            time = Math.max(t, time);

            for(int i = 0; i < 4; i++) {
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && vis[nRow][nCol] != 2 && grid[nRow][nCol] == 1) {
                    q.add(new Pair(nRow, nCol, t + 1));
                    vis[nRow][nCol] = 2;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(vis[i][j] == 0 && grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }
}
