class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int i = 0;
        int j = 0;
        for(int val : nums){
            if(val > 0){
                pos[i] = val;
                i++;
            }
            else{
                neg[j] = val;
                j++;
            }
        }

        for(int p = 0;p < n / 2;p++){
            nums[2*p] = pos[p];
            nums[2*p + 1] = neg[p];
        }

        return nums;
    }
}