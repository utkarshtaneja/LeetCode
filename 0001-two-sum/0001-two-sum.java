class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force
        // int n = nums.length;
        // int[] ans = new int[2];
        // for(int i = 0;i < n;i++){
        //     for(int j = i + 1;j < n;j++){
        //         if(nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // Optimised
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{i, map.get(rem)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}