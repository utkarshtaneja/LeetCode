class Solution {
    public int findJudge(int n, int[][] trust) {
        // Initialize a hashmap to store the trust relationship
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int[] relation : trust) {
            if(!map.containsKey(relation[0])) {
                map.put(relation[0], new ArrayList<>());
            }
            map.get(relation[0]).add(relation[1]);
        }
        
        // Initialize a hashmap to store the number of times a person is trusted
        
        HashMap<Integer, Integer> count = new HashMap<>();
        for(Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            for(int trusted : e.getValue()) {
                count.put(trusted, count.getOrDefault(trusted, 0) + 1);
            }
        }
        
        // Find the person who is trusted by everyone but does not trust anyone
        
        for(int i = 1; i <= n; i++) {
            if(!map.containsKey(i) && count.getOrDefault(i, 0) == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}