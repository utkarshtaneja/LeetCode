class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;

        while(fast < nums.length){
            if(fast > 0 && nums[fast] == nums[fast - 1]){
                fast++;
            }
            else{
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }

        return slow;
    }
}