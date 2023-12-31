class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                int incr = map.getOrDefault(nums[i],0) + 1;
                map.put(nums[i],incr);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                ans = e.getKey();
            }
        }
        return ans;  
    }
}