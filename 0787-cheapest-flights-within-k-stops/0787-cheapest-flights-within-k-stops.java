class Solution {
    static class Pair{
        int first;
        int second;

        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    static class Tuple{
        int first;
        int second;
        int third;

        public Tuple(int first, int second, int third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for(int i = 0; i < m; i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }
        
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0, src, 0));
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            int stops = tuple.first;
            int node = tuple.second;
            int cost = tuple.third;
            
            if(stops > k) continue;
            for(Pair pair : adj.get(node)){
                int adjNode = pair.first;
                int edW = pair.second;
                
                if(cost + edW < dist[adjNode] && stops <= k){
                    dist[adjNode] = cost + edW;
                    q.add(new Tuple(stops + 1, adjNode, cost + edW));
                }
            }
        }
        if(dist[dst] == Integer.MAX_VALUE) return -1;
        return dist[dst];
    }
}