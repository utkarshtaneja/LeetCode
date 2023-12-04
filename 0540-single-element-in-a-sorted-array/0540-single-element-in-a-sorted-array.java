class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Brute Force
        int ans = 0;
        for(int i = 0;i < nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}