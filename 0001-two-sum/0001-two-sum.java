class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force
        int n = nums.length;
        int[] ans = new int[2];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i;j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}