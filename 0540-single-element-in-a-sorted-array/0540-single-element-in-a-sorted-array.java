class Solution {
    public int singleNonDuplicate(int[] nums) {
        // BRUTE FORCE APPROACH
        int n = nums.length;
        int ans = 0;

        for(int i = 0;i<n;i++){
            ans = ans ^ nums[i];
        }

        return ans;
    }
}