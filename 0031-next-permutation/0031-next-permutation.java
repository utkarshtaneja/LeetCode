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

        // 1 Find the break point
        int index = -1; 
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }

        // If break point does not exist
        if(index == -1) {
            // reverse the whole array
            reverse(0, n - 1, nums);
        } 

        else {
            //2: Find the next greater element and swap it with nums[index]
            for(int i = n - 1; i > index; i--) {
                if(nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }

            // Step 3: reverse the right half:
            reverse(index + 1, n - 1, nums);
        }
    }
}