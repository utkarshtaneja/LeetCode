class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // Brute Force
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for(int i = 0;i < n;i++){
            sum = nums[i];
            if(sum == goal){
                count++;
            }
            for(int j = i + 1;j < n;j++){
                sum += nums[j];
                if(sum == goal){
                    count++;
                }
                else if(sum > goal){
                    sum = 0;
                    break;
                }
            }
        }
        return count;
    }
}