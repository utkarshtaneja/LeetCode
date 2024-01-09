class Solution {
    private Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        if(map.containsKey(n)) {
            return map.get(n);
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, result);

        return result;
    }
}