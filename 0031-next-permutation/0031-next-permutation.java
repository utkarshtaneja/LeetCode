class Solution {
    public static void reverse(int s, int e, int[] nums){
        while(s <= e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        
        for(int i = n - 2;i >= 0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(0, n-1, nums);
        }
        else{
            for(int i= n - 1;i > index;i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            reverse(index + 1, n - 1, nums);
        }
    }
}