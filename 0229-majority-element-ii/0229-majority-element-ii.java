class Solution {
    public List<Integer> majorityElement(int[] nums) {
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
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > n/3){
                list.add(e.getKey());
            }
        }
        return list;
    }
}