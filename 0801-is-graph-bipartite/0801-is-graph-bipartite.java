class Solution {
    public static boolean dfs(int node, int col,int color[], ArrayList<ArrayList<Integer>> adj){
        color[node] = col;

        for(int val : adj.get(node)){
            if(color[val] == -1){
                if(!dfs(val, 1 - col, color, adj)) return false;
            }
            else if(color[val] == col){
                return false;
            }
        }

        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }

        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i = 0;i < n;i++){
            if(color[i] == -1){
                if(!dfs(i, 0, color, adj)) return false;
            }
        }
        return true;
    }
}