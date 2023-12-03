class Solution {
    public int majorityElement(int[] nums) {
        // Brute Force 
        int count = 1;
        int candidate = nums[0];
        int n = nums.length;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == candidate) {
                count++;
            } 
            else {
                count--;
                if(count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for(int num : nums) {
            if(num == candidate) {
                count++;
            }
        }

        return count > n / 2 ? candidate : -1;
        // Optimal Approach
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int n = nums.length;
        // for(int i = 0;i < n;i++){
        //     if(map.containsKey(nums[i])){
        //         int incr = map.getOrDefault(nums[i],0)+1;
        //         map.put(nums[i],incr);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }
        // int max = 0;
        // for(Map.Entry<Integer,Integer> e : map.entrySet()){
        //     if(e.getValue() > n/2){
        //         max = e.getKey();
        //     }
        // }
        // return max;
    }
}