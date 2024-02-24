class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }
        
        int m = prerequisites.length;
        for(int i = 0;i < m;i++){
            adj.get( prerequisites[i][1] ).add( prerequisites[i][0] );
        }
        
        int[] indegree = new int[n];
        for(int i = 0;i < n;i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i < n;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        int[] topo = new int[n];
        int index = 0;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            topo[index++] = curr;
            
            for(int it : adj.get(curr)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        if(index == n) return topo;
        int[] arr = {};
        return arr;
    }
}