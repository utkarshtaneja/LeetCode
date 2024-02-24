// Using DFS

// class Solution {
//     public static boolean dfs(int curr, int[] vis, int[][] graph, int[] pathVis, int[] check){
//         vis[curr] = 1;
//         pathVis[curr] = 1;
//         check[curr] = 0;
        
//         for(int it : graph[curr]){
//             if(vis[it] == 0){
//                 if(dfs(it, vis, graph, pathVis, check)){
//                     return true;
//                 }
//             }
//             else if(pathVis[it] == 1){
//                 return true;
//             }
//         }
//         check[curr] = 1;
//         pathVis[curr] = 0;
//         return false;
//     }
//     public List<Integer> eventualSafeNodes(int[][] graph) {
//         int V = graph.length;
//         int[] vis = new int[V];
//         int[] pathVis = new int[V];
//         int[] check = new int[V];
        
        
//         Arrays.fill(vis, 0);
//         Arrays.fill(pathVis, 0);
        
//         for(int i = 0;i < V;i++){
//             if(vis[i] == 0){
//                 dfs(i, vis, graph, pathVis, check);
//             }
//         }
        
//         List<Integer> ans = new ArrayList<>();
//         for(int i = 0;i < V;i++){
//             if(check[i] == 1){
//                 ans.add(i);
//             }
//         }
//         return ans;
//     }
// }

// Using BFS/Kahn's Algo
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        List<List<Integer>> rev = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            rev.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j : graph[i]) {
                rev.get(j).add(i); 
                indegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();
        while(!q.isEmpty()) {
            int curr = q.poll();
            safeNodes.add(curr);

            for(int it : rev.get(curr)) {
                indegree[it]--;
                if(indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        Collections.sort(safeNodes);
        return safeNodes;
    }
}
