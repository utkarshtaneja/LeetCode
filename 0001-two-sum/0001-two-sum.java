class Solution {
    public int[] twoSum(int[] nums, int target) {
        // BRUTE FORCE APPROACH
        // int[] ans = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             ans[0] = i;
        //             ans[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // OPTIMIZED APPROACH
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;
            if (map.containsKey(rem)) {
                return new int[]{i, map.get(rem)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}