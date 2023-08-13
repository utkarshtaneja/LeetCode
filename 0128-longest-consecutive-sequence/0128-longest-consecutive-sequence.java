class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        int longest = 1;

        if(nums.length == 0 || nums == null){
            return 0;
        }
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1] - nums[i] == 1){
                ans++;
                longest = Math.max(longest, ans);
            }
            else if (nums[i + 1] - nums[i] > 1) {
                ans = 1;
            }
        }
        return longest;

    }
}