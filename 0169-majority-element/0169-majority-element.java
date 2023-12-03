class Solution {
    public int majorityElement(int[] nums) {
        // Optimal Approach
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(map.containsKey(nums[i])){
                int incr = map.getOrDefault(nums[i],0)+1;
                map.put(nums[i],incr);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > n/2){
                max = e.getKey();
            }
        }
        return max;
    }
}