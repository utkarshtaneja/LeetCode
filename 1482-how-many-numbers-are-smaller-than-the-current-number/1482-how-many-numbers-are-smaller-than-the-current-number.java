class Solution {
    public static int count(int[] nums,int element){
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < element){
                ans++;
            }
        }
        return ans;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;

        for(int i = 0;i<n;i++){
            ans[i] = count(nums,nums[i]);
        }

        return ans;
    }
}