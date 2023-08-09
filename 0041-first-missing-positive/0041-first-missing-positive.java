class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean one = false;

        // 1. Map the elements which are out of range by 1.
        for(int i = 0;i<n;i++){
            if( nums[i] < 1 || nums[i] > n){
                nums[i] = 1;
            }
            else if(nums[i] == 1){
                one = true;
            }
        }

        // 2. Check if 1 is present or not
        if(!one){
            return 1;
        }
       
        // 3. Change the 1s by their negative
        for(int i = 0;i<n;i++){
            int index = Math.abs(nums[i]);
            nums[index - 1] = -Math.abs(nums[index - 1]);
        }

        // 4. Check for first positive
        for(int i = 0;i<n;i++){
            if(nums[i] > 0){
                return i+1;
            }
        }

        return n+1;
    }
}