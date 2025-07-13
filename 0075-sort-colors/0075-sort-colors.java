class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int val : nums){
            if(val == 0) count0++;
            else if(val == 1) count1++;
            else count2++;
        }

        int index = 0;
        while(count0 > 0){
            nums[index] = 0;
            count0--;
            index++;
        }

        while(count1 > 0){
            nums[index] = 1;
            count1--;
            index++;
        }

        while(count2 > 0){
            nums[index] = 2;
            count2--;
            index++;
        }
    }
}