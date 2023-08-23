class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int incr = map.get(nums[i]);
                map.put(nums[i], incr + 1);
            } 
            else {
                map.put(nums[i], 1);
            }
        }

        int[] result = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result[i] = entry.getKey();
                i++;
            }
        }

        return result;
    }
}