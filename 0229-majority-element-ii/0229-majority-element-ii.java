class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < n;i++) {
            if (map.containsKey(nums[i])) {
                int incr = map.getOrDefault(nums[i] , 0) + 1;
                map.put(nums[i], incr);
            }
            else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > n / 3) {
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}