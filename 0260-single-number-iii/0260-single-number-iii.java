class Solution {
    public int[] singleNumber(int[] nums) {
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
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                list.add(e.getKey());
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0;i < list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;  
    }
}