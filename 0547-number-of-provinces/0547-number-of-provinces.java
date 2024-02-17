class Solution {
    public static void dfs(int curr, ArrayList<ArrayList<Integer>> adj,int[] vis) {
        vis[curr] = 1;
        for(Integer neighbor : adj.get(curr)) {
            if(vis[neighbor] == 0) {
                dfs(neighbor, adj, vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(); 
        for(int i = 0;i < V;i++) {
            list.add(new ArrayList<Integer>()); 
        }
        
        // to change adjacency matrix to list 
        for(int i = 0;i < V;i++) {
            for(int j = 0;j < V;j++) {
                if(isConnected[i][j] == 1 && i != j) {
                    list.get(i).add(j); 
                    list.get(j).add(i); 
                }
            }
        }
        int vis[] = new int[V]; 
        int cnt = 0; 
        for(int i = 0;i < V;i++) {
            if(vis[i] == 0) {
               cnt++;
               dfs(i, list, vis); 
            }
        }
        return cnt; 
    }
}
