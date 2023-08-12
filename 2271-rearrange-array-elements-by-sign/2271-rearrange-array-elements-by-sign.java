class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n/2];
        int pi = 0;
        int[] negative = new int[n/2];
        int ni = 0;

        for(int i = 0;i<n;i++){
            if(nums[i] < 0){
                negative[ni] = nums[i];
                ni++;
            }
            else{
                positive[pi] = nums[i];
                pi++;
            }
        }

        pi = 0;
        ni = 0;
        for(int i = 0;i<n;i++){
            if(i % 2 == 0){
                nums[i] = positive[pi];
                pi++;
            }
            else{
                nums[i] = negative[ni];
                ni++;
            }
        }

        return nums;
    }
}