class Solution {
    public static boolean dfs(int curr, int[] vis, int[][] graph, int[] pathVis, int[] check){
        vis[curr] = 1;
        pathVis[curr] = 1;
        check[curr] = 0;
        
        for(int it : graph[curr]){
            if(vis[it] == 0){
                if(dfs(it, vis, graph, pathVis, check)){
                    return true;
                }
            }
            else if(pathVis[it] == 1){
                return true;
            }
        }
        check[curr] = 1;
        pathVis[curr] = 0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        int[] vis = new int[V];
        int[] pathVis = new int[V];
        int[] check = new int[V];
        
        
        Arrays.fill(vis, 0);
        Arrays.fill(pathVis, 0);
        
        for(int i = 0;i < V;i++){
            if(vis[i] == 0){
                dfs(i, vis, graph, pathVis, check);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < V;i++){
            if(check[i] == 1){
                ans.add(i);
            }
        }
        return ans;
    }
}