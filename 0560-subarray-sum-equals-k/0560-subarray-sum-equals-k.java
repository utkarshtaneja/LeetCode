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
        // int n = nums.length;
        // int count = 0;
        // for(int i = 0;i<n;i++){
        //     int sum = 0;
        //     for(int j = i;j<n;j++){
        //         sum = sum + nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;


        // OPTIMAL SOLUTION
        int n = nums.length;
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1); 
        for(int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int remove = prefixSum - k;

            count = count + map.getOrDefault(remove, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;

    }
}
