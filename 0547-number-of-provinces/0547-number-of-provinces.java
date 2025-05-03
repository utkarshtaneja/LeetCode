class Solution {
    public static void dfs(int curr, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[curr] = true;
    
        for(int val : adj.get(curr)) {
          if(!vis[val]) {
            dfs(val, vis, adj);
          }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int n = isConnected.length;
        int m = isConnected[0].length;

        for(int i = 0;i < n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            adj.add(temp);
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(i != j && isConnected[i][j] == 1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] vis = new boolean[n + 1];
        int count = 0;
        for(int i = 0;i < n;i++){
            if(!vis[i]) {
                dfs(i ,vis, adj);
                count++;
            }
        }

        return count;
    }
}