class Solution {
    public int subarraySum(int[] nums, int k) {
        // BRUTE FORCE
        // int n = nums.length;
        // int count = 1;
        // for(int i = 0;i<n;i++){
        //     for(int j = i;j<n;j++){
        //         int sum = 0;
        //         for(int p = i;p<j;p++){
        //             sum = sum + nums[p];
        //         }

        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;


        // BETTER SOLUTION
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;

    }
}
