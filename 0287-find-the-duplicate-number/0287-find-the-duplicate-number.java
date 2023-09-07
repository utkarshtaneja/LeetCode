class Solution {
    public int findDuplicate(int[] nums) {
        // MY SOLUTION
        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0;i<n;i++){
        //     if(map.containsKey(nums[i])){
        //         int incr = map.getOrDefault(nums[i],1)+1;
        //         map.put(nums[i],incr);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }

        // int ans = -1;
        // for(Map.Entry<Integer,Integer> e : map.entrySet()){
        //     if(e.getValue() > 1){
        //         ans = e.getKey();
        //     }
        // }
        // return ans;

        // OPTIMIZED METHOD - Tortoise approach
        int n = nums.length;
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}