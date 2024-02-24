class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int N = numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < N;i++){
            adj.add(new ArrayList<>());
        }
        int m = prerequisites.length;
        for(int i = 0;i < m;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        int[] indegree = new int[N];
        for(int i = 0;i < N;i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i < N;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        ArrayList<Integer> topo = new ArrayList<>();
        
        while(!q.isEmpty()){
            int curr = q.poll();
            topo.add(curr);
            
            for(int it : adj.get(curr)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        if(topo.size() == N) return true;
        return false;
    }
}