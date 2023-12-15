class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        int count = 0;
        for(int i = 0;i < n;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
            else{
                count++;
            }
        }
        while(count != 0){
            nums[index] = 0;
            index++;
            count--;
        }
    }
}