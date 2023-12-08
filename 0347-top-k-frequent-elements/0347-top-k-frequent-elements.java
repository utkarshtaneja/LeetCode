class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(map.containsKey(nums[i])){
                int incr = map.getOrDefault(nums[i], 0) + 1;
                map.put(nums[i],incr);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        
        for(int key : map.keySet()) {
            pq.add(key);
        }
        
        int[] ans = new int[k];
        for(int i = 0;i < ans.length;i++){
            ans[i] = pq.poll();  
        }
        return ans;
    }
}