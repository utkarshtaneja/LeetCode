class Solution {
    public static void dfs(int curr, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[curr] = 1;
        for(int it : adj.get(curr)){
            if(vis[it] == 0){
                dfs(it, vis, adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int m = isConnected[0].length;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        int count = 0;
        int[] vis = new int[n];
        Arrays.fill(vis, 0);
        for(int i = 0;i < n;i++){
            if(vis[i] == 0){
                count++;
                dfs(i, vis, adj);
            }
        }
        return count;
    }
}