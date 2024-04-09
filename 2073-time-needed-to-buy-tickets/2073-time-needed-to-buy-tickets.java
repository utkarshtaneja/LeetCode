class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int n = tickets.length;
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0;i < n;i++){
            q.add(i);
        }
        
        while(! q.isEmpty()){
            int curr = q.poll();
            tickets[curr]--;
            time++;
            
            if(tickets[curr] == 0 && curr == k){
                return time;
            }
            if(tickets[curr] > 0){
                q.add(curr);
            }
        }
        return time;
    }
}