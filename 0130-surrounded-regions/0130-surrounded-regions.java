class Solution {
    public static boolean cornercase(int i, int j, int n, int m){
        if( (i == 0) || (j == 0) || (i == n - 1) || (j == m - 1) ){
            return true;
        }
        return false;
    }
    public static void dfs(int row, int col, boolean[][] vis, char[][] board){
        vis[row][col] = true;

        int n = board.length;
        int m = board[0].length;
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        for(int i = 0;i < 4;i++){
            int nRow = dRow[i] + row;
            int nCol = dCol[i] + col;

            if(nRow >= 0 && nCol >= 0 && nRow < n && nCol < m && !vis[nRow][nCol] && board[nRow][nCol] == 'O'){
                dfs(nRow, nCol, vis, board);
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];

        for(int i = 0;i < n;i++){
            Arrays.fill(vis[i], false);
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(cornercase(i, j, n, m) && board[i][j] == 'O' && !vis[i][j]){
                    dfs(i, j, vis, board);
                }
            }
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(!vis[i][j] && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
}